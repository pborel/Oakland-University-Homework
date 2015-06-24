package vehicle;

public class VehicleClient {

    public static void main(String[] args) {
        
        //Line below would generate an error
        //Vehicle v = new Vehicle("John", 4);
        
        MotorizedVehicle mv1 = new MotorizedVehicle("Mike", 4, 3.2);
        MotorizedVehicle mv2 = new MotorizedVehicle("Sarah", 4, 4.0);
        
        System.out.println(mv1.toString() + " has " + mv1.horsePower() + " horsepower ");
        System.out.println(mv2.toString() + " has " + mv2.horsePower() + " horsepower ");
        
        mv2.setOwner(mv1.getOwner());
        
        if(mv1.equals(mv2))
            System.out.println("mv1 and mv2 are equal");
        else
            System.out.println("mv1 and mv2 are not equal");
        
        mv2.setVolumeDisplacement(mv1.getVolumeDisplacement());
        //mv1 and mv2 already have the same number of wheels, no need to do the following:
        //mv2.setWheels(mv1.getWheels());
        
        if(mv1.equals(mv2))
            System.out.println("mv1 and mv2 are equal");
        else
            System.out.println("mv1 and mv2 are still not equal");
        
        Bicycle b2 = new Bicycle("Jane", 2);
        System.out.println("\nb2" + b2.toString());
    }
    
}
