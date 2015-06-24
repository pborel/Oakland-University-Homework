/* HOMEWORK #2
* WINTER 2015
* Joseph, Borel
* KaJuan, Johnson
* Both partners worked together to complete the lab
*/

package homework2_borel_johnson;
import java.util.Scanner;

public class SolveEquation {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter a: ");
        while ( ! scan.hasNextInt( ) )
        {
            String garbage = scan.nextLine();
            System.out.println( "Please enter a numeric value for \"a\":" );
        }
        int a = scan.nextInt();
        
        
        System.out.println("Enter b: ");
        while ( ! scan.hasNextInt( ) )
        {
            String garbage = scan.nextLine();
            System.out.println( "Please enter a numeric value for \"b\":" );
        }
        int b = scan.nextInt();
        
        System.out.println("Enter c: ");
        while ( ! scan.hasNextInt( ) )
        {
            String garbage = scan.nextLine();
            System.out.println( "Please enter a numeric value for \"c\":" );
        }
        int c = scan.nextInt(); 
        
        Quadratic equation = new Quadratic(a, b, c);
        
        System.out.println( equation.toString() );

        System.out.println( equation.solveQuadratic()); 
        System.out.println( equation.getComment() );
      
        /*
        double real = scan.nextDouble();
        System.out.println("Enter a imaginary");
        double imag = scan.nextDouble();
        
        Complex num = new Complex(real, imag );
        Complex num2 = new Complex(4.0, -7.0); 
         
        System.out.println( "Real number: " + num.getReal() );
        System.out.println( "Imaginary number: " + num.getImaginary() );
        System.out.println( "Are they equal: " + num.equals(num2) );
        System.out.println( "Is it real: " + num.isReal() );
        System.out.println( "Complex number: " + num.toString() ); 
        
        Complex num3 = new Complex(4.0, -7.0);
        ComplexPair pair1 = new ComplexPair( num2, num3 );
        ComplexPair pair2 = new ComplexPair(num, num2);
        
        System.out.println("Are they identical: " + pair1.bothIdentical() );
        System.out.println("Are they equal: " + pair1.equals(pair2));
        System.out.println("First complex: " + pair1.getFirst() );
        System.out.println("Second complex: " + pair2.getSecond() ); 
        System.out.println("ComplexPair: " + pair1.toString() );
      */     
    }
}
