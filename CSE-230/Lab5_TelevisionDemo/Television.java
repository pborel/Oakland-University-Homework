// The purpose of this class is to model a television
// Joseph Borel, 3/2/15

package lab5;

import java.util.Scanner;

public final class Television {
    // Constants that set the manufacturer (brand) and screen size.
    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    
    // Variables that return the state of power, channel, and volume of the TV.
    private boolean powerON = false;
    private int channel = 2;
    private int volume = 20;
    
    Scanner scan = new Scanner (System.in);

    /**
     *This is an overloaded constructor that will assign a brand and size of the client's choosing to a TV object.
     * @param brand
     * @param size
     */
        public Television( String brand , int size ){
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        }
    
    // Mutators
    
    /**
     * Allows input from client to change the channel.
     * @param station
     */
    public void setChannel( int station ){
        channel = station;
    }
   
    /**
     * Sets powerON to the opposite of what it currently is.
     */
    public void power( ){
        powerON = powerON = !powerON;
    }
    /**
    * Increases the volume of the TV by 1 is the volume is less than 100.
    */
    public void increaseVolume( ){
       if( volume < 100 )
           volume = ++volume;
       else
           System.err.println( "Volume cannot exceed 100." );
    }
    
    /**
    * Decreases the volume of the TV by 1 is the volume is greater than 0.
    */
    public void decreaseVolume( ){
        if( volume > 0 )
                volume = --volume;
        else
           System.err.println( "Volume cannot be lower than 0." );
    }
    
    // Accessors
    
    /**
    * Returns the current value of channel.
    * @return channel 
    */
    public int getChannel( ){
        return channel;
    }
    
    /**
    * Returns the current value of volume.
    * @return volume
    */
    public int getVolume( ){
        return volume;
    }
    
    /**
    * Returns the constant MANUFACTURER set at creation of the TV object.
    * @return MANUFACTURER
    */
    public String getManufacturer( ){
        return MANUFACTURER;
    }
    
    /**
    * Returns the constant SCREEN_SIZE set at creation of the TV object.
    * @return SCREEN_SIZE
    */
    public int getScreenSize( ){
        return SCREEN_SIZE;
    }
    
    // Overridden toString method.
    @Override
    public String toString( ){
        return "The manufacturer is: " + getManufacturer( )
                + "\nThe screen size is: " + getScreenSize( )
                + "\nThe current channel is: " + getChannel( )
                + "\nThe current volume is: " + getVolume( );
    }
    
    // equals method.
    public String equals( Object object1, Object object2 ){
        if( object1.equals( object2 ) )
            return object1 + " is equal to " + object2;
        else
            return object1 + " is not equal to " + object2;
    }
    
}
