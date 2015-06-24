package vehicle;

public class Bicycle extends Vehicle {
    
    public Bicycle(String owner, int wheels) {
        super(owner, wheels);
        setOwner(owner);
        setWheels(wheels);
    }
    
    /**
     * @return double - total horsepower for a Bicycle object is 0
     */
    @Override
    public double horsePower() {
        return 0;
    }
    
}
