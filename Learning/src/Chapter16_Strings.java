/**
 * @author PNimmanapalli
 *
 * A character literal is an integer value represented as a character
in single quotes. For example, 'z' represents the integer value of z, and '\n' represents the
integer value of newline. The value of a character literal is the integer value of the character
in the Unicode character set.

 A string is an object of class String. String literals (stored in memory as String objects)
are written as a sequence of characters in double quotation marks, as in:
			String color = "blue";
			
String methods length, charAt and getChars return the length of a String, obtain the
character at a specific location in a String and retrieve a set of characters from a String
as a char array,
String methods equals, equalsIgnoreCase, compareTo and regionMatches and using the equality operator == to compare String objects.

String methods startsWith and endsWith

many versions of String methods indexOf and lastIndexOf that search for a specified character or substring in a String

Class String provides two substring methods to enable a new String object to be created
by copying part of an existing String object. Each method returns a new String object.

String method concat  concatenates two String objects and returns a new String object containing the characters from both original Strings

Method replace leaves the original String unchanged. If there are no occurrences of the first argument
in the String, method replace returns the original String. An overloaded version
of method replace enables you to replace substrings rather than individual characters

The expression String.valueOf(charArray) at line 18 uses the character array char-
Array to create a new String object. The expression String.valueOf(charArray, 3, 3)
at line 20 uses a portion of the character array charArray to create a new String object.

There are seven other versions of method valueOf, which take arguments of type
boolean, char, int, long, float, double and Object, respectively

class StringBuilder for creating and manipulating dynamic
string information—that is, modifiable strings. Every StringBuilder is capable of storing
a number of characters specified by its capacity. If a StringBuilder’s capacity is
exceeded, the capacity expands to accommodate the additional characters.

StringBuilders are not thread safe. If multiple threads require access to the same
dynamic string information, use class StringBuffer in your code. Classes StringBuilder
and StringBuffer provide identical capabilities, but class StringBuffer is thread safe.

 *
 *
 */
public class Chapter16_Strings {

	public static void main( String[] args )
	{
		char[] charArray = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
		String s = new String( "hello" );
		
		// use String constructors
		String s1 = new String();
		String s2 = new String( s );
		String s3 = new String( charArray );
		String s4 = new String( charArray, 6, 3 );
		
		System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1, s2, s3, s4 ); // display strings
		
		// This application demonstrates the length, charAt and getChars
		// methods of the String class
		
		String s5 = "hello there";
		char[] charArray1 = new char[ 5 ];
		System.out.printf( "s1: %s", s1 );
		
		// test length method
		System.out.printf( "\nLength of s1: %d", s5.length());
		
		// loop through characters in s1 with charAt and display reversed
		System.out.print( "\nThe string reversed is: " );
		for ( int count = s5.length() - 1; count >= 0; count-- )
			System.out.printf( "%c ",s5.charAt( count ));
		
		// copy characters from string into charA
		s5.getChars( 0, 5, charArray, 0 );
		
		System.out.print( "\nThe character array is: " );
		
		for ( char character : charArray1 )
			System.out.print( character );
		
		System.out.println();
		
		// String methods equals, equalsIgnoreCase, compareTo and regionMatches
		String s6 = new String( "hello" ); // s1 is a copy of "hello"
		
		String s7 = "goodbye";
		String s8 = "Happy Birthday";
		String s9 = "happy birthday";
		
		System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n\n", s6, s7, s8, s9 );
		
		if(s6.equals( "hello" ) )  // true
			System.out.println( "s6 equals \"hello\"" );
		else
			System.out.println( "s6 does not equal \"hello\"" );
		
		// test for equality with ==
		if ( s6 == "hello" ) // false; they are not the same object
			System.out.println( "s6 is the same object as \"hello\"" );
		else
			System.out.println( "s6 is not the same object as \"hello\"" );
		
		// test for equality (ignore case)
		if (s8.equalsIgnoreCase( s9 ) ) // true
			System.out.printf( "%s equals %s with case ignored\n", s8, s9 );
		else
			System.out.println( "s8 does not equal s9" );
		
		// test compareTo
		
		System.out.printf("\ns6.compareTo( s7 ) is %d", s6.compareTo( s7 ) );
		
		System.out.printf("\ns7.compareTo( s6 ) is %d", s7.compareTo( s6 ) );
		
		System.out.printf("\ns6.compareTo( s6 ) is %d", s6.compareTo( s6 ) );
		
		System.out.printf("\ns8.compareTo( s9 ) is %d", s8.compareTo( s9 ) );
		
		System.out.printf("\ns9.compareTo( s8 ) is %d", s9.compareTo( s8 ) );
		
		// test regionMatches (case sensitive)
		if (s8.regionMatches( 0, s9, 0, 5 ))
			System.out.println( "First 5 characters of s8 and s9 match" );
		else
			System.out.println("First 5 characters of s8 and s9 do not match" );
		
		// test regionMatches (ignore case)
		if (s8.regionMatches( true , 0 , s9, 0, 5 ))
			System.out.println( "First 5 characters of s8 and s9 match with case ignore" );
		else
			System.out.println("First 5 characters of s8 and s9 do not match" );
		
		// String methods startsWith and endsWith
		String[] strings = { "started", "starting", "ended", "ending" };
		
		// test method startsWith
		for ( String string : strings )
		{
			if (string.startsWith( "st" ))
				System.out.printf( "\"%s\" starts with \"st\"\n", string );
		}
		
		System.out.println();
		
		// test method startsWith starting from position 2 of string
		
		for ( String string : strings )
		{
			if (string.startsWith( "art", 2 ) )
				System.out.printf( "\"%s\" starts with \"art\" at position 2 \n", string );
		}
		
		System.out.println();
		
		// test method endsWith
		for ( String string : strings )
		{
			if (string.endsWith( "ed" ) )
				System.out.printf( "\"%s\" ends with \"ed\"\n", string );
		}
		
		System.out.println();
		
		// String searching methods indexOf and lastIndexOf
		
		String letters = "abcdefghijklmabcdefghijklm";
		
		// test indexOf to locate a character in a string
		System.out.printf("'c' is located at index %d\n", letters.indexOf( 'c' ) );
		System.out.printf("'a' is located at index %d\n", letters.indexOf( 'a', 1 ) );
		System.out.printf( "'$' is located at index %d\n\n", letters.indexOf( '$' ) );
		
		// test lastIndexOf to find a character in a string
		System.out.printf( "Last 'c' is located at index %d\n", letters.lastIndexOf( 'c' ) );
		System.out.printf( "Last 'a' is located at index %d\n", letters.lastIndexOf( 'a', 25 ) );
		System.out.printf( "Last '$' is located at index %d\n\n", letters.lastIndexOf( '$' ) );
		
		// test indexOf to locate a substring in a string
		System.out.printf( "\"def\" is located at index %d\n", letters.indexOf( "def" ) );
		System.out.printf( "\"def\" is located at index %d\n", letters.indexOf( "def", 7 ) );
		System.out.printf( "\"hello\" is located at index %d\n\n", letters.indexOf( "hello" ) );
		
		// test lastIndexOf to find a substring in a string
		System.out.printf( "Last \"def\" is located at index %d\n", letters.lastIndexOf( "def" ) );
		System.out.printf( "Last \"def\" is located at index %d\n", letters.lastIndexOf( "def", 25 ) );
		System.out.printf( "Last \"hello\" is located at index %d\n", letters.lastIndexOf( "hello" ) );
		
		// String class substring methods
		// test substring methods
		System.out.printf( "Substring from index 20 to end is \"%s\"\n", letters.substring( 20 ) );
		System.out.printf( "%s \"%s\"\n", "Substring from index 3 up to, but not including 6 is", letters.substring( 3, 6 ) );
		
		// String method concat
		String s10 = "Happy ";
		String s11 = "Birthday";
		
		System.out.printf( "s10 = %s\ns11 = %s\n\n",s10, s11 );
		System.out.printf( "Result of s10.concat( s11 ) = %s\n", s10.concat( s11 ) );
		System.out.printf( "s10 after concatenation = %s\n", s10 );
		
		// String methods replace, toLowerCase, toUpperCase, trim and toCharArray
		String s12 = "hello";
		String s13 = "GOODBYE";
		String s14 = " spaces ";
		
		System.out.printf( "s12 = %s\ns13 = %s\ns14 = %s\n\n", s12, s13, s14 );
		
		// test method replace
		System.out.printf( "Replace 'l' with 'L' in s12: %s\n\n", s12.replace( 'l', 'L' ) );
		
		// test toLowerCase and toUpperCase
		System.out.printf( "s12.toUpperCase() = %s\n", s12.toUpperCase() );
		System.out.printf( "s13.toLowerCase() = %s\n\n", s13.toLowerCase() );
		
		// test trim method
		System.out.printf( "s14 after trim = \"%s\"\n\n", s14.trim() );
		
		// test toCharArray method
		char[] charArray2 = s12.toCharArray();
		System.out.print( "s12 as a character array = " );
		for ( char character : charArray )
			System.out.print( character );
		System.out.println();
		
		// String valueOf methods
		char[] charArray3 = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000000L; // L suffix indicates long
		float floatValue = 2.5f; // f indicates that 2.5 is a float
		double doubleValue = 33.333; // no suffix, double is default
		Object objectRef = "hello"; // assign string to an Object reference
		
		System.out.printf( "char array = %s\n", String.valueOf( charArray3 ) );
		System.out.printf( "part of char array = %s\n", String.valueOf( charArray3, 3, 3 ));
		System.out.printf( "boolean = %s\n", String.valueOf( booleanValue ) );
		System.out.printf( "char = %s\n", String.valueOf( characterValue ) );
		System.out.printf( "int = %s\n", String.valueOf( integerValue ) );
		System.out.printf( "long = %s\n", String.valueOf( longValue ) );
		System.out.printf( "float = %s\n", String.valueOf( floatValue ) );
		System.out.printf( "double = %s\n", String.valueOf( doubleValue ) );
		System.out.printf( "Object = %s", String.valueOf( objectRef ) );
		
		System.out.println();
		
		
	}	
}
