package Lab2_Joseph_Borel;

/* A client program to display SimpleDate object values
   Anderson, Franceschi
*/

/* LAB #2 Question 1
 * SEMESTER: Winter 2015
 * NAME: Joseph (Phil), Borel
 * 
 * The following program is my own work/effort. If part of my code is not based
 * on my own effort then otherwise I will acknowledge the author/site and
 * reference it clearly.
*/

import java.awt.*;
import javax.swing.JFrame;

public class SimpleDateClient extends JFrame
{
  private String action = "";

  private int animationPause = 2; // 2 seconds between animations

  private SimpleDate dateObj; // declare SimpleDate object reference

    /*
     *
     */
  
    public void workWithDates( )
  {
    animate( "dateObj reference declared" );

    /***** Add your code here *****/
    /**** 1. Instantiate dateObj using an empty argument list  */
    dateObj = new SimpleDate();


    animate( "Instantiated dateObj - empty argument list" );

    /***** 2. Set the month to the month you were born */
    dateObj.setMonth(5);

    animate( "Set month to birth month" );

    
    /***** 3. Set the day to the day of the month you were born */
    dateObj.setDay(3);

    animate( "Set day to birth day" );


    /***** 4. Set the year to the year you were born */
    dateObj.setYear(1994);

    animate( "Set year to birth year" );


    /***** 5. Call the nextDay method */
    dateObj.nextDay();

    animate( "Set the date to the next day" );


    /***** 6. Set the day to 32, an illegal value */
    dateObj.setDay(32);

    animate( "Set day to 32" );
    /* This displays the day as "1" because in SimpleDate.java there is a 
     * method called "isValidDay" that defines the valid days via an array for
     * month of the year. If a day value is entered that causes the method to 
     * return "False" then the day value assigned to that object will be the 
     * default day value for that constructor (which is 1).
    */


    /***** 7. Set the month to 13, an illegal value */
    dateObj.setMonth(13);

    animate( "Set month to 13" );
    /* This displays the month as "1" because in SimpleDate.java there is a 
     * Mutator called "setMonth" that defines the a months as between 1 and 12.
     * If an argument is given to this Mutator, than the Mutator will return a
     * default value of 1.
    */

    /***** 8. Assign the value null to dateObj */
    dateObj = null;

    animate( "Set object reference to null" );


    /***** 9. Attempt to set the month to 1 */
    /* An error occurs because the previous "dateObj = null;" throws this object
     * to the garbage collector. After this happens, the object cannot be reused
    */
    dateObj.setMonth(1);
  }

  public SimpleDateClient( )
  {
    super( "A SimpleDate Object" );

    setSize( 300, 300 );
    setVisible( true );
  }

  public void paint( Graphics g )
  {
    super.paint( g );

    // display action
    g.drawString( action, 50, 250 );

    // object reference
    int sX = 50, sY = 75;
    int boxL = 75, boxH = 20;
    g.drawRect( sX, sY, boxL, boxH );
    g.drawString( "dateObj", sX, sY - 10 );

    if ( dateObj != null )
       draw( g );
    else
      g.drawString( "null", sX + 15, sY + 15 );
  }

  public void draw( Graphics g )
  {
    int sX = 50, sY = 75;
    int boxL = 75, boxH = 20;

    // arrow
    g.drawLine( sX + boxL, sY + boxH / 2,
                sX + boxL + 25, sY + boxH / 2 );
    g.drawLine( sX + boxL + 25, sY + boxH / 2,
                sX + boxL + 25, sY + boxH * 2 );
    g.drawLine( sX + boxL + 25 - 5, sY + boxH * 2 - 5,
                sX + boxL + 25, sY + boxH * 2 );
    g.drawLine( sX + boxL + 25 + 5, sY + boxH * 2 - 5,
                sX + boxL + 25, sY + boxH * 2 );


    // month
    g.drawString( "month", sX + boxL - 50, sY + 2 * boxH + 15 );
    g.drawRect( sX + boxL, sY + 2 * boxH, boxL, boxH );
    g.drawString( Integer.toString( dateObj.getMonth( ) ),
                   sX + boxL + 5, sY + 2 * boxH + 15 );

    // day
    g.drawString( "day", sX + boxL - 50, sY + 3 * boxH + 15 );
    g.drawRect( sX + boxL, sY + 3 * boxH, boxL, boxH );
    g.drawString( Integer.toString( dateObj.getDay( ) ),
                  sX + boxL + 5, sY + 3 * boxH + 15 );

    // year
    g.drawString( "year", sX + boxL - 50, sY + 4 * boxH + 15 );
    g.drawRect( sX + boxL, sY + 4 * boxH, boxL, boxH );
    g.drawString( Integer.toString( dateObj.getYear( ) ),
                  sX + boxL + 5, sY + 4 * boxH + 15 );
  }

  public void animate( String a )
  {
    action = a;
    repaint( );
    Pause.wait( (double) animationPause );
  }

  public static void main( String [] args )
  {
    SimpleDateClient app = new SimpleDateClient( );
    app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    app.workWithDates( );
  }
}
