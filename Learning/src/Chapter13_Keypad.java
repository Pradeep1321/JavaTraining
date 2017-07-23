//Keypad.java
//Represents the keypad of the ATM
import java.util.Scanner; // program uses Scanner to obtain user input

public class Chapter13_Keypad
{
	private Scanner input; // reads data from the command line
	                      
	// no-argument constructor initializes the Scanner
	public Chapter13_Keypad()
	{
	   input = new Scanner( System.in );    
	} // end no-argument Keypad constructor
	
	// return an integer value entered by user 
	public int getInput()
	{
	   return input.nextInt(); // we assume that user enters an integer  
	} // end method getInput
} // end class Keypad  

