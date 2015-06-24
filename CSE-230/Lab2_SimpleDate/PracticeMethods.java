package Lab2_Joseph_Borel;

/* Chapter 3 Programming Activity 2
   Calling class methods
   Anderson, Franceschi
*/

/* LAB #2 Question 2
 * SEMESTER: Winter 2015
 * NAME: Joseph (Phil), Borel
 * 
 * The following program is my own work/effort. If part of my code is not based
 * on my own effort then otherwise I will acknowledge the author/site and
 * reference it clearly.
*/
        
// ***** add your import statements here
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class PracticeMethods
{
  public static void main( String [] args )
  {
    //*****
    // 1.  a. Create a Scanner object to read from the console
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    // Your code goes here
      // a
      Scanner scan = new Scanner(System.in);
      
      // b
      System.out.println("Enter your first name: ");
      String firstName = scan.next();
      
      // c
      System.out.println("Hello, " + firstName + ".");
      
      // d
      System.out.println("There are " + firstName.length() + " letters in the name " + firstName + ".");
      
      
    //*****
    // 2.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Calculate and print the age the user will be this year.
    //     c. Declare a constant for average life expectancy,
    //            set its value to 78.7.
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage
      // a
      System.out.println();
      System.out.println( "Enter the year you were born: " );
      int yearOfBirth = scan.nextInt();
      
      // b
      int ageThisYear = 2015 - yearOfBirth;
      System.out.println("This year, you will be " + ageThisYear + " years old.");
      
      // c
      final double AVERAGELIFE = 78.7;
      
      // d
      double percentOfLifeLived = ( ageThisYear / AVERAGELIFE );
      NumberFormat percentFormat = NumberFormat.getPercentInstance( );
      System.out.println( "You have lived " + percentFormat.format( percentOfLifeLived ) + " of the supplied average expected lifetime." );
      

    //*****
    // 3.  a. Generate a random integer between 1 and 20
    //     b. Pop up an input dialog box and ask the user for a guess.
    //     c. Pop up an output dialog box telling the user the number
    //         and how far from the number the guess was (hint: 
    //         use Math.abs)
      // a
      System.out.println();
      Random random = new Random();
      int randomInt = random.nextInt( 20 ) + 1;
      
      // b
      String input = JOptionPane.showInputDialog( null, "Let's play a game. To win this game, enter THE correct number.\nThe correct number is a random number between 1 and 20.\nEnter your guess: " );
      int userGuessInt = Integer.parseInt(input);
      
      // c
      if ( userGuessInt < 1 || userGuessInt > 20 )
          JOptionPane.showMessageDialog( null, "You did not enter a number between 1 and 20. As punishment the program will terminate." );
      else
          {
              if ( userGuessInt == randomInt )
                  JOptionPane.showMessageDialog( null, "Congratulations, that is the correct number!" );
              else
              {
                  JOptionPane.showMessageDialog( null, "The correct number was " + randomInt );
                  
                  if ( Math.abs( userGuessInt - randomInt ) > 3 )
                      JOptionPane.showMessageDialog( null, "You were way off! Maybe you should find a new game to play?" );
                  else
                      JOptionPane.showMessageDialog( null, "You were less than 3 numbers off! Maybe you should play again?" );
                  
                  JOptionPane.showMessageDialog( null, "Better luck next time!" );
              }
          }
  }
}