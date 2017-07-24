/**
 * @author PNimmanapalli
 * *data structures—collections of related data items. Arrays are data
structures consisting of related data items of the same type
 *Arrays remain the same length once they’re created, although
an array variable may be reassigned such that it refers to a new array of a different
length.

ArrayLists are similar to arrays but provide additional functionality,
such as dynamic resizing—they automatically increase their size at execution time to
accommodate additional elements.

An index must be an int value or a value of a type that can be promoted to int—namely,
byte, short or char, but not long; otherwise, a compilation error occurs

When an array is created, each element of the array receives a default value—zero for the numeric primitive-type elements,
false for boolean elements and null for references.

A program can create several arrays in a single declaration.

String[] b = new String[ 100 ], x = new String[ 27 ];

String b[] = new String[ 100 ]; // create array b


7.6 Enhanced for Statement
// add each element's value to total
for ( int number : array )
	total += number;
the enhanced for statement can be used only to obtain array elements—it cannot be used to modify elements
 
 The enhanced for statement can be used in place of the counter-controlled for statement
whenever code looping through an array does not require access to the counter indicating
the index of the current array element.

Two ways to pass arguments in method calls inmany programming
languages are pass-by-value and pass-by-reference (also called call-by-value and call-byreference).
When an argument is passed by value, a copy of the argument’s value is passed
to the called method. The called method works exclusively with the copy. Changes to the
called method’s copy do not affect the original variable’s value in the caller.
When an argument is passed by reference, the called method can access the argument’s
value in the caller directly and modify that data, if necessary. Pass-by-reference
improves performance by eliminating the need to copy possibly large amounts of data.

7.11 Variable-Length Argument Lists
With variable-length argument lists, you can create methods that receive an unspecified
number of arguments. A type followed by an ellipsis (...) in a method’s parameter list
indicates that the method receives a variable number of arguments of that particular type.
This use of the ellipsis can occur only once in a parameter list, and the ellipsis, together
with its type, must be placed at the end of the parameter list. While you can use method
overloading and array passing to accomplish much of what is accomplished with variablelength
argument lists, using an ellipsis in a method’s parameter list is more concise.

 	public static double average( double... numbers)
 

 *
 *
 */
public class Chapter7_5_Card {

	private String face; // face of card ("Ace", "Deuce", ...)
	private String suit; // suit of card ("Hearts", "Diamonds", ...)
	
	// two-argument constructor initializes card's face and suit
	public Chapter7_5_Card( String cardFace, String cardSuit )
	{
	 face = cardFace; // initialize face of card
	 suit = cardSuit; // initialize suit of card
	 } // end two-argument Card constructor
	
	// return String representation of Card
	public String toString()
	{
	return face + " of " + suit;
	} // end method toString
}
