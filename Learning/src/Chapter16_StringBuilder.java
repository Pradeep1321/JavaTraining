/**
 * 
 *We now discuss the features of class StringBuilder for creating and manipulating dynamic
string information—that is, modifiable strings. Every StringBuilder is capable of storing
a number of characters specified by its capacity.

StringBuilders are not thread safe. If multiple threads require access to the same
dynamic string information, use class StringBuffer in your code. Classes StringBuilder
and StringBuffer provide identical capabilities, but class StringBuffer is thread safe

 the no-argument StringBuilder constructor to create a String-Builder with no characters in it and an initial capacity of 16 characters (the default for a
StringBuilder)

The initial capacity is the number of characters in the String argument plus 16.

16.4.2 StringBuilder Methods length, capacity, setLength and ensureCapacity:
Class StringBuilder provides methods length and capacity to return the number of
characters currently in a StringBuilder and the number of characters that can be stored
in a StringBuilder without allocating more memory, respectively. Method ensure-
Capacity guarantees that a StringBuilder has at least the specified capacity. Method setLength increases or decreases the length of a StringBuilder 

16.4.3 StringBuilder Methods charAt, setCharAt, getChars and reverse

Method getChars () copies characters from a StringBuilder into the character array
passed as an argument. This method takes four arguments—the starting index from
which characters should be copied in the StringBuilder, the index one past the last character
to be copied from the StringBuilder, the character array into which the characters
are to be copied and the starting location in the character array where the first character
should be placed.

16.4.4 StringBuilder append Methods:
Class StringBuilder provides overloaded append methods to allow values of
various types to be appended to the end of a StringBuilder.

16.4.5 StringBuilder Insertion and Deletion Methods:


 * 
 **/
public class Chapter16_StringBuilder {

	public static void main( String[] args )
	{
		// StringBuilder constructors.
		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder( 10 );
		StringBuilder buffer3 = new StringBuilder( "hello" );
		
		System.out.printf( "buffer1 = \"%s\"\n", buffer1 );
		System.out.printf( "buffer2 = \"%s\"\n", buffer2 );
		System.out.printf( "buffer3 = \"%s\"\n", buffer3 );
		
		// StringBuilder length, setLength, capacity and ensureCapacity methods.
		StringBuilder buffer = new StringBuilder( "Hello, how are you?" );
		System.out.printf( "buffer = %s\nlength = %d\ncapacity = %d\n\n", buffer.toString(), buffer.length() , buffer.capacity() );
		
		buffer.ensureCapacity( 75 );
		
		System.out.printf( "New capacity = %d\n\n", buffer.capacity() );
		
		System.out.printf( "New capacity buffer = %s\n\n", buffer.toString() );
		
		buffer.setLength( 10 );
		
		System.out.printf( "New length = %d\nbuffer = %s\n", buffer.length() , buffer.toString() );
		
		// StringBuilder methods charAt, setCharAt, getChars and reverse
		StringBuilder buffer4 = new StringBuilder( "hello there" );
		System.out.printf( "buffer = %s\n", buffer4.toString() );
		System.out.printf( "Character at 0: %s\nCharacter at 4: %s\n\n", buffer4.charAt( 0 ) , buffer4.charAt( 4 ) );
		
		char[] charArray = new char[ buffer4.length() ];
		buffer4.getChars( 0, buffer4.length(), charArray, 0 );
		System.out.print( "The characters are: " );
		
		for ( char character : charArray )
			System.out.print( character );
		
		buffer4.setCharAt( 0, 'H' );
		buffer4.setCharAt( 6, 'T' );
		
		System.out.printf( "\n\nbuffer = %s", buffer4.toString() );
		
		buffer1.reverse();
		
		System.out.printf( "\n\nbuffer = %s\n", buffer4.toString() );
		
		// StringBuilder append methods
		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray1 = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		
		StringBuilder lastBuffer = new StringBuilder( "last buffer" );
		StringBuilder buffer5 = new StringBuilder();
		
		buffer5.append( objectRef );
		buffer5.append( "\n" );
		buffer5.append( string );
		buffer5.append( "\n" );
		buffer5.append( charArray );
		buffer5.append( "\n" );
		buffer5.append( charArray, 0, 3 );
		buffer5.append( "\n" );
		buffer5.append( booleanValue );
		buffer5.append( "\n" );
		buffer5.append( characterValue );
		buffer5.append( "\n" );
		buffer5.append( integerValue );
		buffer5.append( "\n" );
		buffer5.append( longValue );
		buffer5.append( "\n" );
		buffer5.append( floatValue );
		buffer5.append( "\n" );
		buffer5.append( doubleValue );
		buffer5.append( "\n" );
		buffer5.append( lastBuffer );
		
		System.out.printf( "buffer contains %s\n", buffer5.toString() );
		
		
		String string1 = "hello";
		String string2 = "BC";
		int value = 22;
		
		String s = string1 + string2 + value;
		// the above statement can be performed as the below statement
		String s1 = new StringBuilder().append( "hello" ).append( "BC" ).append( 22 ).toString();
		
		s += "!";
		// the above statement can be performed as the below statement
		s = new StringBuilder().append( s ).append( "!" ).toString();
		
		// StringBuilder methods insert, delete and deleteCharAt
		Object objectRef1 = "hello";
		String string3 = "goodbye";
		char[] charArray3 = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue1 = true;
		char characterValue1 = 'K';
		int integerValue1 = 7;
		long longValue1 = 10000000;
		float floatValue1 = 2.5f; // f suffix indicates that 2.5 is a float
		double doubleValue1 = 33.333;
		
		StringBuilder buffer6 = new StringBuilder();
		buffer6.insert( 0, objectRef1 );
		buffer6.insert( 0, " " ); // each of these contains two spaces
		buffer6.insert( 0, string3 );
		buffer6.insert( 0, " " );
		buffer6.insert( 0, charArray3 );
		buffer6.insert( 0, " " );
		buffer6.insert( 0, charArray3, 3, 3 );
		buffer6.insert( 0, " " );
		buffer6.insert( 0, booleanValue1 );
		buffer6.insert( 0, " " );
		buffer6.insert( 0, characterValue1 );
		buffer6.insert( 0, " " );
		buffer6.insert( 0, integerValue1 );
		buffer6.insert( 0, " " );
		buffer6.insert( 0, longValue1 );
		buffer6.insert( 0, " " );
		buffer6.insert( 0, floatValue1 );
		buffer6.insert( 0, " " );
		buffer6.insert( 0, doubleValue1 );
		
		System.out.printf( "buffer after inserts:\n%s\n\n", buffer6.toString() );
		
		buffer6.deleteCharAt( 10 ); // delete 5 in 2.5
		buffer6.delete( 2, 6 ); // delete .333 in 33.333
		
		System.out.printf("buffer after deletes:\n%s\n", buffer6.toString() );
		
	}
	
	
}
