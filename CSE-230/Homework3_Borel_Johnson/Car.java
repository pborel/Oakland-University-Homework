/* HOMEWORK #3
* WINTER 2015
* JOSEPH BOREL
* KAJUAN JOHNSON
* Both partners worked together to complete the lab
*/
package Carbon_Footprint;

public class Car implements CarbonFootprint {
    
    private double gallons;
    
    /**
     * A constructor of car that takes the amount of gas as an argument
     * @param g 
     */
    public Car( double g ) {
        this.gallons = g;
    }
    
    /**
     * A Override method for getCarbonFootprint from the interface of CarbonFootprint 
     * @return 
     */
    @Override
    public double getCarbonFootprint( ) {
        return gallons * 20;
    }
    
     /**
     * toString overrode method
     * @return String -  Calls getCarbonFootprint() to determine carbon footprint based off of gallons of gas
     */
    @Override
    public String toString() {
        return ("Car that has used " + gallons + " of gas: " + this.getCarbonFootprint());
    }
}
