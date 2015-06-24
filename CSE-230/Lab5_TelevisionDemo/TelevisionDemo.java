/* LAB #5
*WINTER 2015
*JOSEPH, BOREL
* Following program is my own effort/work. If part of my code is not based on my own effort then otherwise I will acknowledge the author/site and reference it clearly.
*/

package lab5;

import java.util.Scanner;

public class TelevisionDemo
{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);

		//declare variables
		int station;	//the user's channel choice

		//declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		//turn the power on
		bigScreen.power();
		//display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + " inch " +
			bigScreen.getManufacturer()	+ " has been turned on.");
		//prompt the user for input and store into station
		System.out.print("What channel do you want?  ");
		station = keyboard.nextInt();

		//change the channel on the television
		bigScreen.setChannel(station);
		//increase the volume of the television
		bigScreen.increaseVolume();
		//display the the current channel and volume of the television
		System.out.println("Channel:  " + bigScreen.getChannel() +
			"   Volume:  "	+ bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");
		//decrease the volume of the television
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		//display the current channel and volume of the television
		System.out.println("Channel:  " + bigScreen.getChannel() +
			"   Volume:  "	+ bigScreen.getVolume());
		System.out.println();   	//for a blank line


		//HERE IS WHERE YOU DO TASK #5
                
                // #2, 3
                // Another Television object called portable.
                Television portable = new Television("Sharp", 19);
                
                // #4
                // Turn portable on.
                portable.power( );
                
                // #5
                // Print that portable was turned on
		System.out.println( "A " + portable.getScreenSize( ) + " inch " +
			portable.getManufacturer( )	+ " has been turned on." );
                
                // #6
                // Change channel to users preference.
		System.out.print( "What channel do you want?  " );
		station = keyboard.nextInt( );
		portable.setChannel( station );
		// Decrease the volume of the television by 2.
		portable.decreaseVolume();
		portable.decreaseVolume();
                
                // #7
                // Print the changed state of portable.
                System.out.println("Channel:  " + portable.getChannel() +
			"   Volume:  "	+ portable.getVolume());
	}
}