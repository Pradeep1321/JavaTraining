/**
 * @author PNimmanapalli
 *
 * *16.5 Class Character
 *Java provides eight type-wrapper classes—Boolean, Character, Double, Float, Byte,
Short, Integer and Long—that enable primitive-type values to be treated as objects.

Most Character methods are static methods designed for convenience in processing
individual char values.

Character method isDefined to determine whether character c is defined in the Unicode character set.

Character method isDigit to determine whether character c is a defined Unicode digit.

Character method isJavaIdentifierStart to determine whether c is
a character that can be the first character of an identifier in Java—that is, a letter, an underscore
(_) or a dollar sign ($).

static Character methods digit and forDigit, which convert characters to digits and digits to characters

Common number systems include decimal (base 10), octal (base 8), hexadecimal
(base 16) and binary (base 2). The base of a number is also known as its radix.


 *
 */


import java.util.Scanner;

public class Chapter16_Character {

	public static void main( String[] args )
	{
		
		Scanner scanner = new Scanner( System.in ); // create scanner
		System.out.println( "Enter a character and press Enter" );
		String input = scanner.next();
		
		char ch = input.charAt( 0 ); // get input character
		
		// display character info
		System.out.printf( "is defined: %b\n", Character.isDefined( ch ) );
		System.out.printf( "is digit: %b\n", Character.isDigit( ch ) );
		System.out.printf( "is first character in a Java identifier: %b\n", Character.isJavaIdentifierStart( ch ) );
		System.out.printf( "is part of a Java identifier: %b\n", Character.isJavaIdentifierPart( ch ) );
		System.out.printf( "is letter: %b\n", Character.isLetter( ch ) );
		System.out.printf("is letter or digit: %b\n", Character.isLetterOrDigit( ch ) );
		System.out.printf("is lower case: %b\n", Character.isLowerCase( ch ) );
		System.out.printf( "is upper case: %b\n", Character.isUpperCase( ch ) );
		System.out.printf( "to upper case: %s\n", Character.toUpperCase( ch ) );
		System.out.printf( "to lower case: %s\n", Character.toLowerCase( ch ) );
		
		// Character class static conversion methods
		
		// get radix
		System.out.println( "Please enter a radix:" );
		int radix = scanner.nextInt();
		
		// get user choice
		System.out.printf( "Please choose one:\n1 -- %s\n2 -- %s\n",
				 "Convert digit to character", "Convert character to digit" );
		
		int choice = scanner.nextInt();
		// process request
		switch ( choice )
		{
		
		case 1: // convert digit to character
			 System.out.println( "Enter a digit:" );
			 int digit = scanner.nextInt();
			 System.out.printf( "Convert digit to character: %s\n", Character.forDigit( digit, radix ) );
			 break;
		case 2: // convert character to digit
			System.out.println( "Enter a character:" );
			char character = scanner.next().charAt( 0 );
			System.out.printf( "Convert character to digit: %s\n", Character.digit( character, radix ) );
			break;
		}
	
	
		Character c1 = 'A';
		Character c2 = 'a';
		
		System.out.printf( "c1 = %s\nc2 = %s\n\n", c1.charValue() , c2.toString() );
		
		if(c1.equals( c2 ) )
			System.out.println( "c1 and c2 are equal\n" );
		else
			System.out.println( "c1 and c2 are not equal\n" );
	
	
	}
	
}
