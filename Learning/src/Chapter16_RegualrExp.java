/**
 * @author PNimmanapalli
 *
 *A regular expression is a String that describes a search pattern for matching characters in other Strings 


String method matches receives a String that specifies the regular expression and matches the contents of the String object
on which it’s called to the regular expression.

some predefined character classes that can be used with regular expressions
Character    Matches                    Character         Matches
\d           any digit                  \D               any nondigit
\w           any word character          \W              any nonword character
\s           any white-space character    \S             any nonwhite-space character

A digit is any numeric character. 
A word character is any letter (uppercase or lowercase), any digit or the underscore character. 
A white-space character is a space, a tab, a carriage return, a newline or a form feed.

To match a set of characters that does not have a predefined character class, use square brackets, [].
For example, the pattern "[aeiou]" matches a single character that’s a vowel.

Character ranges are represented by placing a dash (-) between two characters. In the example, "[A-Z]"

If the first character in the brackets is "^", the expression accepts any character other than those indicated

The range "[A-z]" matches all letters and also matches those characters (such as [ and \) with an integer value between uppercase Z and
lowercase a

[A-Z][a-zA-Z]* --> 	the asterisk after the second character class indicates that any number of letters can be matched.
In general, when the regular-expression operator "*" appears in a regular
expression, the application attempts to match zero or more occurrences of the
subexpression immediately preceding the "*".

Operator "+" attempts to match one or more occurrences of the subexpression immediately preceding "+". So both "A*" and "A+"
will match "AAA" or "A", but only "A*" will match an empty string.

The character "|" matches the expression to its left or to its
right. For example, "Hi (John|Jane)" matches both "Hi John" and "Hi Jane".

The parentheses are used to group parts of the regular expression.

"\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" --> the left side of |
matches a single word, and the right side matches two words separated by any amount of
white space. So the address must contain a number followed by one or two words. Therefore,
"10 Broadway" and "10 Main Street" are both valid addresses in this example


 *
 */
public class Chapter16_RegualrExp {

	public static boolean validateFirstName( String firstName )
	{
		return firstName.matches( "[A-Z][a-zA-Z]*" );
	}
	
	
	public static boolean validateLastName( String lastName )
	{
		return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
	}
	
	public static boolean validateAddress( String address )
	{
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
	}
	
	public static boolean validateCity( String city )
	{
		return city.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
	}
	
	public static boolean validateState( String state )
	{
		return state.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
	}
	
	public static boolean validateZip( String zip )
	{
		return zip.matches( "\\d{5}" );
	}
	
	public static boolean validatePhone( String phone )
	{
		return phone.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
	}
	
	
}
