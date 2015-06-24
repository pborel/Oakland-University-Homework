package vehicle;

public abstract class Vehicle {
    
    private String owner;
    private int wheels;
    
    public Vehicle(String owner, int wheels){
        this.owner = owner;
        this.wheels = wheels;
    }
    
    /**
     * Allows other classes in the same package to display the name of the owner of the Vehicle object
     * @return String - name of owner of Vehicle object
     */
    public String getOwner() {
        return owner;
    }
    
    /**
     * Allows other classes in the same package to display number of wheels on Vehicle object
     * @return int - # of wheels on Vehicle object
     */
    public int getWheels() {
        return wheels;
    }
    
    /**
     * Allows other classes in the same package to set the owner for a Vehicle object
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    /**
     * Allows other classes in the same package to set the number of wheels for a Vehicle object
     * @param wheels
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    
    @Override
    public String toString() {
        return  "'s owner is " + this.getOwner()
                + "\n"  + "It has " + this.getWheels() + " wheels";
    }
    
    /**
     * equals method
     * Compares two Vehicle objects for the same field value
     * @param o another Vehicle object
     * @return  a boolean, true if this object has the same
     *          field value as the parameter o
     */
    @Override
    public boolean equals(Object o) {
        if( !(o instanceof Vehicle) )
            return false;
        
        Vehicle v1 = (Vehicle) o;
        
        if( !(this.owner.equals(v1.owner))
                || !(this.wheels == v1.wheels) )
            return false;
        
        return true;
    }
    
    /**
     * abstract class
     * @return total horsepower for Vehicle object 
     */
    public abstract double horsePower();
    
}
