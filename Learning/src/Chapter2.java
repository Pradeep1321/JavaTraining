/**
 * @author PNimmanapalli
 *	 * Java Doc comments
	 * @param args
	 * Javadoc comments enable you to embed program documentation directly in your programs. Such comments
         are the preferred Java documenting format in industry.
         
         Normally, an identifier that does not begin with a capital letter is not a class
    	name. Java is case sensitive—uppercase and lowercase letters are distinct—so value and
		Value are different (but both valid) identifiers.
		
		A public class must be placed in a file that has the same name as the class (in terms of
		both spelling and capitalization) plus the .java extension; otherwise, a compilation error
		occurs. For example, public class Welcome must be placed in a file named Welcome.java.      
	 *
	 *
	 *Any class can contain a main method. The JVM invokes the main method only in the class used to execute the application. If an application has multiple classes that contain
		main, the one that’s invoked is the one in the class named in the java command. 

	// Single line comments
	/* Multiple
	 * Line Comments
	 * 
	 * 
	 */
	/**
	 *
	 *
	 *
	 *"/"
 *
 *
 */


import java.util.Scanner;;

public class Chapter2 
{
	public static void main (String[] args)
	{
		System.out.println("Welcome to Java");
		
		/**Displaying Multiple Lines of Text with a Single Statement */
		System.out.println("This will print \n multiple \n lines");
		
		/** Displaying Text with printf --> f means formatted --> uses this method to outpu the strings */

		System.out.printf("%s %s \n", "Welcome to Java", "Promgramming");
		
		// create a Scanner to obtain input from the command window
		Scanner Scan = new Scanner(System.in);
		int number1,number2, sum;
		System.out.print( "Enter first integer: " );
		number1 = Scan.nextInt();
		System.out.print( "Enter Second integer: " );
		number2 = Scan.nextInt();
		sum=number1 + number2;
		
		System.out.printf("The Sum of %d and %d is %d \n", number1, number2, sum);
		
		Scan.close();
		
	}
}
