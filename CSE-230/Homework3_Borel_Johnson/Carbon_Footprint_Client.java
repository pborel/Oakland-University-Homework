/* HOMEWORK #3
* WINTER 2015
* JOSEPH BOREL
* KAJUAN JOHNSON
* Both partners worked together to complete the lab
*/
package Carbon_Footprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Carbon_Footprint_Client {

    public static void main(String[] args) {
        
        Scanner building = new Scanner( System.in );
        Scanner car = new Scanner( System.in );
        
        System.out.println( "Carbon Footprint calculator 1: " );
        
        Building b1 = new Building(2500);
        Car c1 = new Car(10);
        Bicycle bike1 = new Bicycle();
        
        ArrayList<CarbonFootprint> temp = new ArrayList<>(Arrays.asList(b1, c1, bike1));
        
        for (CarbonFootprint temp1 : temp) {
            System.out.println(temp1.toString());
        }
                
        System.out.println( "\nCarbon Footprint calculator 2: " );
        
        System.out.println( "Enter the squarefootage for the building as a whole number: " );
        while ( !building.hasNextInt( ) ) {
            String garbage = building.nextLine( );
            System.err.println( "Please enter an integer for the squarefootage of the building: " );
        }
        int sqft = building.nextInt( );
        
        CarbonFootprint B1 = new Building( sqft );
        
        System.out.println( "Enter the gallons of gas used by the car: " );
        while ( !car.hasNextDouble( ) ) {
            String garbage = building.nextLine( );
            System.err.println( "Please enter an integer for the squarefootage of the building: " );
        }
        double gal = car.nextDouble( );
        
        CarbonFootprint c2 = new Car( gal );
        
        CarbonFootprint b2 = new Bicycle( );
        
        System.out.println( "A building with " + sqft + " squarefeet has"
                + " a carbon footprint of: " + B1.getCarbonFootprint( ) );
        
        System.out.println( "A car that has used " + gal + " gallons of gas"
                + " has a carbon footprint of: " + c1.getCarbonFootprint( ) );
        
        System.out.println( "A bicycle has a carbon footprint of: "
                + b1.getCarbonFootprint( ) );
    }
    
}
