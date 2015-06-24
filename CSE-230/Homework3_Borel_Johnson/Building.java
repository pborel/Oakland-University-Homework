/* HOMEWORK #3
* WINTER 2015
* JOSEPH BOREL
* KAJUAN JOHNSON
* Both partners worked together to complete the lab
*/
package Carbon_Footprint;
/**
 * A public class that uses the interface of CarbonFootprint
 */
public class Building implements CarbonFootprint{
    
    private int squareFeet;
    private int steel = 17, woodFrame = 50, basement = 20, concrete = 47;
    
    public Building( int sf ) {
        this.squareFeet = sf;
    }
    
    /**
     * A Override method for getCarbonFootprint from the interface of CarbonFootprint 
     * @return 
     */
    @Override
    public double getCarbonFootprint( ) {
        return (woodFrame * squareFeet
                + basement * squareFeet
                + concrete * squareFeet
                + steel * squareFeet);
    }
    
    /**
     * toString overrode method
     * @return String -  Calls getCarbonFootprint() to determine carbon footprint based off of squareFeet
     */
    @Override
    public String toString() {
        return ("Building with " + squareFeet + " square feet: " + this.getCarbonFootprint());
    }
    
}
