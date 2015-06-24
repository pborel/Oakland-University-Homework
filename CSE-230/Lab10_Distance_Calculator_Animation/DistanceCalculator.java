public class DistanceCalculator
{
    //Declare yer variables, matey!
    private double kilometers, miles, feet, inches;
    private String boilerPlate = "The converted distance is = ";
    
    DistanceCalculator() {
        kilometers = 0;
    }
    
    //Because I was bored, I made an overloaded constructor!
    public DistanceCalculator(double kilometers) {
        this.kilometers = kilometers;
    }
    
    //Calculations for fun (logic for the radio buttons)
    public double toMiles() {
        miles = kilometers * 0.621371;
        return miles;
    }
 
    public double toFeet() {
        feet = kilometers * 3280.84;
        return feet;
    }
 
    public double toInches() {
        inches = kilometers * 39370.1;
        return inches;
    }
    
    //Useless in this program, but maybe for the future?!
    public double getKilometers() {
        return kilometers;
    }

    public double getMiles() {
        return miles;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    public String getBoilerPlate() {
        return boilerPlate;
    }
    
    //I use this to set my kilometers in my try/catch in the client
    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }
}