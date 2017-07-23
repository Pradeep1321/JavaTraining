/**
 *11.11 Assertions
 Java includes two versions of the assert statement for validating assertions programatically.
The assert statement evaluates a boolean expression and, if false, throws an
AssertionError (a subclass of Error). The first form of the assert statement is
		assert expression;
which throws an AssertionError if expression is false. The second form is
		assert expression1 : expression2;
which evaluates expression1 and throws an AssertionError with expression2 as the error
message if expression1 is false

You use assertions primarily for debugging and identifying logic errors in an application.
You must explicitly enable assertions when executing a program, because they reduce
performance and are unnecessary for the program’s user. To do so, use the java command’s
-ea command-line option, as in
			java -ea Chapter11_11_Assertions


11.12 (New in Java SE 7) Multi-catch: Handling Multiple Exceptions in One catch:
If the bodies of several catch blocks are identical, you can use
the new Java SE 7 multi-catch feature to catch those exception types in a single catch
handler and perform the same task. The syntax for a multi-catch is:
		catch ( Type1 | Type2 | Type3 e )

11.13 (New in Java SE 7) try-with-Resources:
Automatic Resource Deallocation:
The general form of a try-with-resources statement is
		try ( ClassName theObject = new ClassName() )
		{
			// use theObject here
		}
		catch ( Exception e )
		{
			// catch exceptions that occur while using the resource
		}
		
The try-with-resources statement implicitly calls
the theObject’s close method at the end of the try block. You can allocate multiple resources
in the parentheses following try by separating them with a semicolon (;).
 * 
 * 
 **/

//Fig. 11.7: AssertTest.java
//Checking with assert that a value is within range.
import java.util.Scanner;

public class Chapter11_11_Assertions
{
	public static void main( String[] args )
	{
	   Scanner input = new Scanner( System.in );
	   
	   System.out.print( "Enter a number between 0 and 10: " );
	   int number = input.nextInt();
	   
	   // assert that the value is >= 0 and <= 10
	   assert ( number >= 0 && number <= 10 ) : "bad number: " + number;
	   
	   System.out.printf( "You entered %d\n", number );
	} // end main
} // end class AssertTest