/* HOMEWORK #3
* WINTER 2015
* JOSEPH BOREL
* KAJUAN JOHNSON
* Both partners worked together to complete the lab
*/
package Carbon_Footprint;

public class Bicycle implements CarbonFootprint {
    
    /**
     * A Override method for getCarbonFootprint from the interface of Bicycle 
     * @return 
     */
    @Override
    public double getCarbonFootprint( ) {
        return 0;
    }
    
         /**
     * toString overrode method
     * @return String -  Calls getCarbonFootprint() to determine carbon footprint
     */
    @Override
    public String toString() {
        return ("Bicycle: " + this.getCarbonFootprint());
    }
}

