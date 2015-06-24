package vehicle;

public class MotorizedVehicle extends Vehicle {
    
    //Engine volume displacement in liters
    private double volumeDisplacement;
    
    public MotorizedVehicle(String owner,
            int wheels,
            double newVolumeDisplacement) {
        super(owner, wheels);
        setOwner(owner);
        setWheels(wheels);
        this.volumeDisplacement = newVolumeDisplacement; 
    }
    
    /**
     * Allows other classes in same package to access the private value of volumeDisplacement
     * @return double - volumeDisplacement in liters
     */
    public double getVolumeDisplacement() {
        return volumeDisplacement;
    }
    
    /**
     * Set volumeDisplacement of MoterizedVehicle object to client input
     * @param volumeDisplacement
     */
    public void setVolumeDisplacement(double volumeDisplacement) {
        this.volumeDisplacement = volumeDisplacement;
    }
    
    @Override
    public String toString() {
        return this.getOwner() + "'s vehicle";
    }
    
    /**
     * equals method
     * Compares two MotorizedVehicle objects for the same field value
     * @param o another Vehicle object
     * @return  a boolean, true if this object has the same
     *          field values as the parameter o
     */
    @Override
    public boolean equals(Object o) {
        if( !( o instanceof MotorizedVehicle ) )
            return false;
        
        MotorizedVehicle mv1 = (MotorizedVehicle) o;
        
        if( this.getVolumeDisplacement() != mv1.getVolumeDisplacement() 
                || !(this.getOwner() == mv1.getOwner() ) 
                || this.getWheels() != mv1.getWheels() )
            return false;
        
        return true;
    }
    
    /**
     * horsePower of vehicle
     * Calculated by multiplying the vehicle's volumeDisplacement * the number of wheels
     * @return  double - Horsepower of vehicle
     */
    @Override
    public double horsePower() {
        return (volumeDisplacement * getWheels()); 
    }
    
}
