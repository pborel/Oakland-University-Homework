package Problem2;

import javax.swing.JOptionPane;
import java.util.Scanner;

/* HW#: 1
 * SEMESTER: Winter 2015
 * Joseph, Borel
 * KaJuan, Johnson
 * Both partners worked together to complete the lab.
 */

/* Sample Inputs:
 * 1) a = 1, b = 3, c = 2
 * 2) a = .5, b = .5, c = .125
 * 3) a = 1, b = 3, c = 10
*/

public class Quadratic {

    public static void main( String[] args ) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println( "Calculate the roots of an equation." );
        // JOptionPane.showMessageDialog( null, "Calculate the roots of an equation." );
        
        System.out.println( "Please enter a numeric calue for \"a\":" );
        // String inputA = JOptionPane.showInputDialog( null, "Enter a: " );
        while ( ! scan.hasNextDouble( ) )
        {
            String garbage = scan.nextLine();
            System.out.println( "Please enter a numeric value for \"a\":" );
        }
        double a = scan.nextDouble( );
        // Double a = Double.parseDouble( inputA );
        
        System.out.println( "Please enter a numeric calue for \"b\":" );
        // String inputB = JOptionPane.showInputDialog( null, "Enter b: " );
        while ( ! scan.hasNextDouble( ) )
        {
            String garbage = scan.nextLine();
            System.out.println( "Please enter a numeric value for \"b\":" );
        }
        double b = scan.nextDouble( );
        // Double b = Double.parseDouble( inputB );
        
        System.out.println( "Please enter a numeric calue for \"c\":" );
        // String inputC = JOptionPane.showInputDialog( null, "Enter c: " );
        while ( ! scan.hasNextDouble( ) )
        {
            String garbage = scan.nextLine();
            System.out.println( "Please enter a numeric value for \"c\":" );
        }
        double c = scan.nextDouble( );
        // Double c = Double.parseDouble( inputC );
        
        System.out.println( "Solution 1 -> " + getResult1( a, b, c ) + "\nSolution 2 -> " + getResult2( a, b ,c ) );
        // JOptionPane.showMessageDialog( null, "Solution 1 -> " + getResult1( a, b, c ) + "\n Solution 2 -> " + getResult2( a, b ,c ) );
        
    }
    
    public static double getResult1( double quadA, double quadB, double quadC )
    {
        // double result1 = ( ( 0-quadB  +  Math.sqrt( ( quadB * quadB ) - ( 4 * quadA * quadC ) ) ) / ( 2 * quadA ) );
        
        return ( ( 0-quadB  +  Math.sqrt( ( quadB * quadB ) - ( 4 * quadA * quadC ) ) ) / ( 2 * quadA ) );
    }
    
    public static double getResult2( double quadA, double quadB, double quadC )
    {
        // double result2 = ( ( 0-quadB  - ( Math.sqrt( ( quadB * quadB ) - ( 4 * quadA * quadC ) ) ) ) / ( 2 * quadA ) );
        
        return ( ( 0-quadB  - ( Math.sqrt( ( quadB * quadB ) - ( 4 * quadA * quadC ) ) ) ) / ( 2 * quadA )  );
    }
    
}
