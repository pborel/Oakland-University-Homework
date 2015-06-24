package banksystem2;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Accounting extends JFrame
{
 private BankAccount bankAccount;

 public Accounting( )
 {
   super( "Reading objects from a file" );
   bankAccount = new BankAccount( getBackground( ) );
   setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   setSize( 300, 300 );
   setVisible( true );
 }

 @SuppressWarnings("empty-statement")
 public void balanceCheckBook( )
 {
     
         //
         // ***** Student writes the body of this method *****
         //
         // Using a while loop, read the file transactions.obj
         // The file transactions.obj contains transaction objects
         //
         //  You will need to call the animate method inside
         //  the body of the loop that reads the objects
         //
         // The animate method takes two arguments:
         //    a Transaction object, representing the transaction
         //    a double, representing the new checkbook balance
         //  So if these two variables are transaction and balance,
         // then the call to animate will be:
         //
         //   animate( transaction, balance );
         //
         //  You should make that call in the body of your while
         //  loop, after you have updated the checkbook balance
         //
         
         //Create a new file object and read it using Scanner
        try {
            //set starting amount of balance to 0
            double balance = 0;

            //Create a new object reader using FileInputerStream and ObjectInputStream
            FileInputStream fis = new FileInputStream("transactions.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {
                
                while(true) {

                    //instantiate new object of class Transaction
                    Transaction trans = (Transaction) ois.readObject();
                    
                    //read data from file and store it as a double
                    //double transAmount = trans.getAmount();

                    //trans.setAmount(transAmount);

                    //Update the total balance in the account
                    balance += trans.getAmount();
                    trans.updateBalance(balance);

                    //Animate
                    animate(trans, balance);
                }//while

            }//try
     
            catch ( NoSuchElementException nee ) {
                System.out.println( nee.getMessage( ) );
            }
            
            catch (EOFException eofe) {
                System.out.println("End of file reached.");
            }
    
            finally { 
                JOptionPane.showMessageDialog(null, "The final balance is " + balance);
                //Create new FileOutPutStream object called balance.txt and erase it's contents each time
                //FileOutputStream fos = new FileOutputStream("balance.txt", false);
                //Create a PrintWriter object to write to the fos object
                //PrintWriter pw = new PrintWriter(fos);
                //Print the final balance to the new file that the fos object made
                //pw.println(balance);

                ois.close();
                //pw.close();
            }
        }
        catch (FileNotFoundException fnfe) {
            System.err.println("No input file found.");
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Accounting.class.getName()).log(Level.SEVERE, null, ex);
        }
    
 }

 public void writeTransactions( ArrayList<Transaction> transactionList )
 {
   //
   // writing to file transactions.obj
   //

   try
   {
    FileOutputStream fos = new FileOutputStream( "transactions.obj" );
    ObjectOutputStream oos = new ObjectOutputStream( fos );

    Transaction tempTransaction;
    for ( int i = 0; i < transactionList.size( ) ; i++ )
    {
     tempTransaction = ( Transaction ) transactionList.get( i );
     oos.writeObject( tempTransaction );
    }
    oos.close( );
   }
   catch ( IOException ioe )
   {
    System.out.println( ioe.toString( ) );
    System.out.println( ioe.getMessage( ) );
   }

 }

 public void animate( Transaction currentTransaction, double currentBalance )
 {
   // set the currentTransaction data member in the bankAccount object
   bankAccount.setCurrentTransaction( currentTransaction );

   // set the currentBalance data member in the bankAccount object
   bankAccount.updateBalance( currentBalance );

   repaint( );
   try
   {
      Thread.sleep( 3000 ); // wait for the animation to finish
   }
   catch ( Exception e )
   {
   }
 }

 public void paint( Graphics g )
 {
    super.paint( g );
    if ( bankAccount != null )
      bankAccount.draw( g );
 }

 public static void main( String [] args )
 {
   Accounting app = new Accounting( );

   // Generate an ArrayList of Transaction objects to write to file Transaction.obj
   ArrayList<Transaction> transactionList = new ArrayList<Transaction>( );
   Check c1 = new Check( -500.00 );
   transactionList.add( c1 );
   Deposit d1 = new Deposit( 3000.00 );
   transactionList.add( d1 );
   Withdrawal w1 = new Withdrawal( -400.00 );
   transactionList.add( w1 );
   c1 = new Check( -300.00 );
   transactionList.add( c1 );

   // write transactions as objects to file transaction.obj
   app.writeTransactions( transactionList );

   // read transaction.obj, balance the checkbook
   app.balanceCheckBook( );
 }
}
