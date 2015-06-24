package MetricLength;

/*
 * LAB 1
 * WINTER SEMESTER
 * JOSEPH BOREL
 * Following program is my own effort/work. If part of my code is not based on
 * my own effort then otherwise I will acknowledge the author/site and reference
 * it clearly.
 *
 * Calculate the number of centimeters in a given number of inches.
 * @author PhilBorel
 */

public class MetricLength
{

    public static void main( String [] args )
    {
   
       /***** 1. What data values do we know?
       * We know that there are 2.54 centimeters in an inch.
       * Declare a double constant named CM_PER_INCH.
       * Assign CM_PER_INCH the value 2.54.
       */
       final double CM_PER_INCH = 2.54;
       
       /***** 2. What other data does the program require?
       * For this program, we require the number of inches.
       * Declare a double variable named inches.
       * Assign any desired value to this variable.
       */
       double inches = 1;
      
       /***** 3. Calculation: convert inches to centimeters
       * Declare a double variable named centimeters.
       * Multiply inches by CM_PER_INCH
       * and store the result in centimeters.
       */
       double centimeters = inches  * CM_PER_INCH;
        
       /***** 4. Output
       * Write one or two statements that output
       * the original inches and the equivalent centimeters.
       * Try to match the sample output in Figure 2.6.
       */
       System.out.println(inches + " inches are equivalent to " + centimeters + " centimeters.");
    }
}
