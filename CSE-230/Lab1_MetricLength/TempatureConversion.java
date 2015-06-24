package MetricLength;

/*
 * LAB 1
 * WINTER SEMESTER
 * JOSEPH BOREL
 * Following program is my own effort/work. If part of my code is not based on
 * my own effort then otherwise I will acknowledge the author/site and reference
 * it clearly.
 *
 * Calculate the number of degrees Celsuis in a given number of degrees
 * Fahrenheit. Then calculate the number of degrees Fahrenheit back from the 
 * Calculated number of degrees Celsius.
 * @author PhilBorel
 */

public class TempatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
        final int freezingPoint = 32;
        final double factor = (5.0 / 9.0);
			
      //***** 2.  declare temperature in Fahrenheit as an int 
	int tF = 75;
		
      //***** 3. calculate equivalent Celsius temperature	
	double tC;
        tC = ((tF - freezingPoint) * factor);
	  		
      //***** 4. output the temperature in Celsius
	System.out.println(tF + " degrees Fahrenheit is equivalent to " + tC + " degrees Celsius.");
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
	tF = (int) (tC / factor + freezingPoint);
				
      //***** 6. output Fahrenheit temperature to check correctness 
	System.out.println("The initial number of degrees Fahrenheit was " + tF + ".");
				
   }
}
