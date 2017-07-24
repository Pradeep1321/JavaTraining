/**
 * 
 * @author pnimmanapalli
 *
 *Many of the classes you’ll use or create while developing applications will have more
than one method of the same name. This technique, called overloading, is used to implement
methods that perform similar tasks for arguments of different types or for different
numbers of arguments.

Related classes are typically
grouped into packages so that they can be imported into programs and reused.


Methods (called functions or procedures in some languages) help you modularize a
program by separating its tasks into self-contained units.

Although most methods execute in response to method calls on specific objects, this is not
always the case. Sometimes a method performs a task that does not depend on the contents
of any object. Such a method applies to the class in which it’s declared as a whole and is
known as a static method or a class method. It’s common for classes to contain convenient
static methods to perform common tasks.

To declare a method as static, place
the keyword static before the return type in themethod’s declaration. For any class imported
into your program, you can call the class’s static methods by specifying the name of the
class in which the method is declared, followed by a dot (.) and the method name, as in

			ClassName.methodName( arguments )
			
Also all Math class methods are static—therefore, each is called by preceding its name with the class name
Math and the dot (.) separator.

Any field declared with keyword final is constant—its value cannot
change after the field is initialized. PI and E are declared final because their values never
change. Making these fields static allows them to be accessed via the class name Math and
a dot (.) separator

That’s the case with static fields, which are also
known as class variables. When objects of a class containing static fields are created, all the objects of that class share one copy of the class’s static fields. Together the class variables
(i.e., static variables) and instance variables represent the fields of a class.

Why Is Method main Declared static?
When you execute the Java Virtual Machine (JVM) with the java command, the JVM
attempts to invoke the main method of the class you specify—when no objects of the class
have been created. Declaring main as static allows the JVM to invoke main without creating
an instance of the class. When you execute your application, you specify its class
name as an argument to the command java, as in
		java ClassName argument1 argument2 …


The keyword static enables the main method (another static method) to call maximum as shown in
line 21 without qualifying the method name with the class name MaximumFinder—static
methods in the same class can call each other directly

Methods can return at most one value, but the returned value could be a reference to an
object that contains many values

Assembling Strings with String Concatenation:
Java allows you to assemble String objects into larger strings by using operators + or +=.
This is known as string concatenation

Primitive values used in String concatenation are converted to Strings. A boolean
concatenated with a String is converted to the String "true" or "false". All objects
have a toString method that returns a String representation of the object.

When an object is concatenated with a
String, the object’s toString method is implicitly called to obtain the String representation
of the object. ToString can be called explicitly.

A static method can call only other static methods of the same class directly (i.e.,
using the method name by itself) and can manipulate only static variables in the same
class directly.

Redeclaring a parameter as a local variable in the method’s body is a compilation error.

Forgetting to return a value from a method that should return a value is a compilation
error.

6.6 Method-Call Stack and Activation Records
When a program calls a method, the called method must know how to return to its
caller, so the return address of the calling method is pushed onto the program-execution
stack (sometimes referred to as the method-call stack).

The program-execution stack also contains the memory for the local variables used in
each invocation of a method during a program’s execution. This data, stored as a portion
of the program-execution stack, is known as the activation record or stack frame of the
method call.

If more method calls occur than
can have their activation records stored, an error known as a stack overflow occurs.

6.7 Argument Promotion and Casting

Another important feature of method calls is argument promotion—converting an argument’s value,

The promotion rules apply to expressions containing values of two or more primitive
types and to primitive-type values passed as arguments to methods. Each value is promoted
to the “highest” type in the expression. Actually, the expression uses a temporary
copy of each value—the types of the original values remain unchanged.

enumeration:
An enumeration is a special kind of class that’s introduced by the keyword enum and a type name
Inside the braces is a comma-separated list of enumeration constants, each representing a unique value. The identifiers in an enum must be unique.

Method calls cannot be distinguished by return type.

When two methods have the same signature and different return types, the compiler issues an error message indicating that the method is already defined in
the class.
Overloaded methods can have different return types if the methods have different
parameter lists. Also, overloaded methods need not have the same number of parameters.

Declaring overloaded methods with identical parameter lists is a compilation error regardless
of whether the return types are different.

 */

import java.util.Random;

public class Chapter6 {

	private static final Random randomNumbers = new Random();
	
	private static int x = 1;
	
	// enumeration with constants that represent the game status
	private enum Status {WON, LOST, CONTINUE};
	
	//constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	
	public static void main (String[] args){
		
		int myPoint = 0;
		Status gameStatus;
		
		int sumofDice = rollDice();
		
		switch (sumofDice)
		{
		
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumofDice;
			System.out.printf("My Point is %d \n", myPoint);
			break;
		}
		
		while (gameStatus == Status.CONTINUE)
		{
			sumofDice = rollDice();
			
			if (sumofDice == myPoint)
			{
				gameStatus = Status.WON;
			}
			else if (sumofDice == SEVEN)
			{
				gameStatus = Status.LOST;
			}
			
			if (gameStatus == Status.WON)
			{
				System.out.println("Player Wins");
				useField();
				useField();

			}
			else if (gameStatus == Status.LOST)
				System.out.println("Player Loses");
						
		}
		
	}
	
	public static int rollDice()
	{
		int die1 = 1 + randomNumbers.nextInt( 6 );
		int die2 = 1 + randomNumbers.nextInt( 6 );
		
		int sum = die1 + die2;
		
		System.out.printf( "Player rolled %d + %d = %d\n",
				 die1, die2, sum );
		
		return sum;
	}
	
	
	// modify class Scope's field x during each call
	public static void useField()
	{
		System.out.printf("\nfield x on entering method useField is %d\n", x );
		x *= 10; // modifies class Scope's field x
		System.out.printf("\nfield x on exiting method useField is %d\n", x );
	}
	
}
