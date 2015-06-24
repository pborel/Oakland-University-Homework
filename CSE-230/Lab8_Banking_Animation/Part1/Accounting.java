package banksystem;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

public class Accounting extends JFrame
{
 private BankAccount bankAccount;

 public Accounting( )
 {
   bankAccount = new BankAccount( getBackground( ) );
   setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   setSize( 300, 300 );
   setVisible( true );
 }

 public void balanceCheckBook( )
 {
    // ***** Write the body of this method *****
    //
    // Using a while loop, read the file transactions.txt
    // The file transactions.txt contains
    // transactions between you and your bank
    //
    //  You will need to call the animate method inside
    //  the body of the loop that reads the file contents
    //
    // The animate method takes three arguments:
    //    a String, representing the type of transaction
    //    a double, representing the transaction money amount
    //    a double, representing the new checkbook balance
    // So if these three variables are:
    //     transactionName, currentAmount, and balance,
    //  then the call to animate will be:
    //
    //  animate( transactionName, currentAmount, balance );
    //
    // You should make that call in the body of your while
    // loop, after you have updated the checkbook balance
    //
     
     
     try {
        //Set starting amount to 0 
        double balance = 0;
        
        //Create a new file object and read it using Scanner
        Scanner file = new Scanner( new File("transactions.txt"));
        
        while(file.hasNext()) {
            //read data from file
            String token = file.nextLine();
            
            Scanner parse = new Scanner(token);
            
            //Set delimiter to :
            parse.useDelimiter(":");
            String temp = parse.next();
            
            //Read for next double
            double transAmount = parse.nextDouble();
            
            //find carriage returns
            int nextLine = token.indexOf("\n");
            
            //Update the total balance in the account
            balance += transAmount;
            
            //Animate
            animate(temp, transAmount, balance);
        }//while
        
        //Create new FileOutPutStream object called balance.txt and erase it's contents each time
        FileOutputStream fos = new FileOutputStream("balance.txt", false);
        //Create a PrintWriter object to write to the fos object
        PrintWriter pw = new PrintWriter(fos);
        //Print the final balance to the new file that the fos object made
        pw.println(balance);
        
        file.close();
        pw.close();
     }//try
     
     catch (FileNotFoundException fnfe) {
         System.err.println("No input file found.");
     }//catch
     
     catch ( NoSuchElementException nee ) {
         System.out.println( nee.getMessage( ) );
     }//catch
     
     /* Can't happen unless code is changed  
     catch ( IllegalStateException ise ) {
         System.out.println( ise.getMessage( ) );
     }//catch
     */
     
    //
    // end of student code
    //
 }

 public void animate( String currentTransaction, double currentAmount, double currentBalance )
 {
   // set the current transaction in the bankAccount object
   if ( currentTransaction.startsWith( "Ch" ) )
       bankAccount.setCurrentTransaction( new Check(currentAmount ) );
   else if ( currentTransaction.startsWith( "With" ) )
       bankAccount.setCurrentTransaction( new Withdrawal(currentAmount ) );
   else if ( currentTransaction.startsWith( "Dep" ) )
       bankAccount.setCurrentTransaction( new Deposit(currentAmount ) );
   else
       bankAccount.setCurrentTransaction( new UnknownTransaction(currentAmount ) );

   // set the currentBalance data member in the bankAccount object
   bankAccount.updateBalance( currentBalance );

   repaint( );
   try
   {
    Thread.sleep( 3000 );  // wait for the animation to finish
   }
   catch ( Exception e )
   {
   }
 }

 public void paint( Graphics g )
 {
   super.paint( g );
   bankAccount.draw( g );
 }

 public static void main( String [] args )
 {
   Accounting app = new Accounting( );
   app.balanceCheckBook( );
 }
}
