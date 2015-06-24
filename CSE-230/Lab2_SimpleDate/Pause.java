/* Pause class to pause applications
   Anderson, Franceschi
*/

package Lab2_Joseph_Borel;

public class Pause
{
  public static void wait( double seconds )
  {
     try
     {
       Thread.sleep( (int) ( seconds * 1000 ) );
     }
     catch ( InterruptedException e )
     {
       e.printStackTrace( );
     }
  }
}