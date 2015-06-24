package garage;

import java.util.ArrayList;

public class Garage {
    
    private ArrayList<Auto> cars;
    
    public Garage( )
    {
        cars = new ArrayList<Auto>();
    }
    
    /**
     * @return  ArrayList of Autos with each objects Model, Miles Driven, and Gallons of Gas
     */
    public ArrayList<Auto> getCars() {
        for (Auto currentCar : cars) {
           currentCar.getGallonsOfGas();
           currentCar.getMilesDriven();
           currentCar.getModel();
           //return cars;
        }
        return cars;
    }
    
    /**
     * @param newCars   ArrayList of Autos
     */
    public void setCars( ArrayList<Auto> newCars) {
        /*ArrayList<Auto> glist = new ArrayList<Auto>();
        for(Auto currentAuto : cars)
                for(Auto temp : glist) {
                    temp.setModel(currentAuto.getModel());
                    temp.setGallonsOfGas(currentAuto.getGallonsOfGas());
                    temp.setMilesDriven(currentAuto.getMilesDriven());
        */
            cars = newCars;
    }
    
    /**
     * @param   Auto object
     */
    public void addCar( Auto car )
    {
        cars.add( car );
    }
    
    /**
     * @return  number of miles driven for all cars in garage / number of cars in garage
     */
    public double averageMiles( )
    {
        int miles = 0;
        
        for(Auto currentAuto : cars)
            miles += currentAuto.getMilesDriven() / (cars.size());
        
        return miles;
    }
    
    /**
     * @param o Garage object
     * @return  Return true if elements of ArrayList in g are equal to
     *          corresponding elements in this object
     *          and ArrayLists have the same size
     */
    @Override
    public boolean equals( Object o )
    {
        
        if( !( o instanceof Garage ) )
                return false;
        
        Garage g1 = ( Garage ) o;
        
        if ( this.getCars( ).size( ) == g1.getCars( ).size( ) )
            for( int i = 0; i < cars.size( ); i++ )
                if( ! ( this.cars.get( i ).equals( g1.getCars( ).get( i ) ) ) )
                    return false;
        
        return true;    
        /*boolean bool = false;
        
        ArrayList<Auto> glist = new ArrayList<Auto>();
        
        if(glist.size() == cars.size()) { 
            if( !( o instanceof Garage ) )
                bool = false;
            else {
                Garage g1 = ( Garage ) o;
                
                for(Auto currentAuto : cars)
                    for(Auto temp : glist)
                        if  (temp.getModel().equals(currentAuto.getModel())  &&
                                temp.getMilesDriven() == currentAuto.getMilesDriven()  &&
                                temp.getGallonsOfGas() == currentAuto.getGallonsOfGas())
                                //&& temp.size() == g1.cars.size(); 
                            bool = true;
                }
        }*/
    }
    
    /**
     * @return  String
     *          "Full" if ArrayList size is equal to or greater than 100
     *          "Below minimum" if ArrayList size is equal too or less than 25
     *          "Normal load" if ArrayList size is between 26 and 99
     */
    public String occupancy( )
    {
        if ( cars.size( ) >= 100 )
            return "full";
        else if (cars.size( ) <= 25 )
            return "below minimum";
        else
            return "normal load";
    }
    
    /**
     * @return  String with each variable of the Auto object listed
     */
    @Override
    public String toString( )
    {
        String car = "";    
        for (Auto currentCar : cars) {
            car += "\n" + currentCar + "\n";
                    /*
                    + currentCar.getModel()
                    + "\n\tMiles driven: "
                    + currentCar.getMilesDriven()
                    + "\n\tGallons of gas: "
                    + currentCar.getGallonsOfGas()
                    + "\n\n";
                    */
        }
            return car;    
    }
    
    /**
     * @return  double - total gallons of all cars in ArrayList 
     */
    public double totalGallons( )
    {
        double totalGallons = 0;
        
        for (Auto currentCar : cars) {
            totalGallons += currentCar.getGallonsOfGas();
        }
        
        return totalGallons;
    }
    
}
