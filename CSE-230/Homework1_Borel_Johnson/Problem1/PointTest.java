package Problem1;

import javax.swing.JOptionPane;
import java.awt.Point;
import java.text.DecimalFormat;

/* HW#: 1
 * SEMESTER: Winter 2015
 * Joseph, Borel
 * KaJuan, Johnson
 * Both partners worked together to complete the lab.
 */

public class PointTest {

    public static void main( String[] args ) {
        
        DecimalFormat pointFormat = new DecimalFormat( "#0.00" );

        String inputX1 = JOptionPane.showInputDialog( null, "Enter the first x-coordinate" );
        Integer x1 = Integer.parseInt( inputX1 );
        
        String inputY1 = JOptionPane.showInputDialog( null, "Enter the first y-coordinate" );
        Integer y1 = Integer.parseInt( inputY1 );
        
        String inputX2 = JOptionPane.showInputDialog( null, "Enter the second x-coordinate" );
        Integer x2 = Integer.parseInt( inputX2 );
        
        String inputY2 = JOptionPane.showInputDialog( null, "Enter the second y-coordinate" );
        Integer y2 = Integer.parseInt( inputY2 );
       
        Point point1 = new Point( x1, y1 );
        Point point2 = new Point( x2, y2 );
        
        JOptionPane.showMessageDialog(null, "Point 1 is " + point1 + "\nPoint 2 is " + point2);
        
        JOptionPane.showMessageDialog(null, "The resulting vector given by the two supplied points is " + pointFormat.format( euclideanDistance(point1, point2) ));
       
        JOptionPane.showMessageDialog(null, "The City Block Distance between the two supplied points is " + cityBlockDistance( point1, point2 ));
    }
    
    public static double euclideanDistance( Point pointA, Point pointB )
    {
        /* double resultX = Math.pow( (pointA.x - pointB.x), 2 );
         * double resultY = Math.pow( (pointA.y - pointB.y), 2 );
         *
         * double result = Math.sqrt(resultX + resultY);
         *
         * return(result);
        */
        
        return( Math.sqrt( Math.pow( ( pointA.x - pointB.x ), 2 ) + Math.pow( ( pointA.y - pointB.y ), 2 ) ) );
    }
    
    public static int cityBlockDistance( Point pointC, Point pointD )
    {
        
        return( Math.abs( pointC.x - pointD.x ) + Math.abs( pointC.y - pointD.y ) );
    }

    
}
