/**
 *
 The asterisk (*) and plus (+) are formally called quantifiers.
 
 Quantifier       Matches
   *              Matches zero or more occurrences of the pattern.
   +              Matches one or more occurrences of the pattern.
   ?              Matches zero or one occurrences of the pattern.
  {n}             Matches exactly n occurrences.
  {n,}            Matches at least n occurrences.
  {n,m}           Matches between n and m (inclusive) occurrences.

 Replacing Substrings and Splitting Strings:
 Sometimes it’s useful to replace parts of a string or to split a string into pieces. class String provides methods replaceAll, replaceFirst and split.
 
 Classes Pattern and Matcher:
 Class Pattern represents a regular expression. Class Matcher contains both a regular-expression
pattern and a CharSequence in which to search for the pattern.
 
 CharSequence (package java.lang) is an interface that allows read access to a
sequence of characters. The interface requires that the methods charAt, length, subSequence
and toString be declared. Both String and StringBuilder implement interface
CharSequence, so an instance of either of these classes can be used with class Matcher.

If a regular expression will be used only once, static Pattern method matches can
be used. This method takes a String that specifies the regular expression and a CharSequence
on which to perform the match. This method returns a boolean indicating
whether the search object (the second argument) matches the regular expression.
If a regular expression will be used more than once (in a loop, for example), it’s more
efficient to use static Pattern method compile to create a specific Pattern object for
that regular expression. This method receives a String representing the pattern and
returns a new Pattern object, which can then be used to call method matcher. This
method receives a CharSequence to search and returns a Matcher object.
Matcher provides method matches, which performs the same task as Pattern method
matches, but receives no arguments—the search pattern and search object are encapsulated
in the Matcher object. Class Matcher provides other methods, including find,
lookingAt, replaceFirst and replaceAll.


 
 * 
 **/

import java.util.Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chapter16_RegExp_Quantifiers {

	public static void main( String[] args )
	{
		
		String firstString = "This sentence ends in 5 stars *****";
		String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
		
		System.out.printf( "Original String 1: %s\n", firstString );
		
		// replace '*' with '^'
		firstString = firstString.replaceAll( "\\*", "^" );
		
		System.out.printf( "^ substituted for *: %s\n", firstString );
		
		// replace 'stars' with 'carets'
		firstString = firstString.replaceAll( "stars", "carets" );
		
		System.out.printf("\"carets\" substituted for \"stars\": %s\n", firstString );
		
		// replace words with 'word'
		System.out.printf( "Every word replaced by \"word\": %s\n\n", firstString.replaceAll( "\\w+", "word" ) );
		
		System.out.printf( "Original String 2: %s\n", secondString );
		
		// replace first three digits with 'digit'
		for ( int i = 0; i < 3; i++ )
			secondString = secondString.replaceFirst( "\\d", "digit" );
		
		System.out.printf("First 3 digits replaced by \"digit\" : %s\n", secondString );
		
		System.out.print( "String split at commas: " );	
		
		String[] results = secondString.split( ",\\s*" ); // split on commas
		
		System.out.println( Arrays.toString( results ) );
		
		System.out.println();
		
		// create regular expression
		Pattern expression = Pattern.compile( "J.*\\d[0-35-9]-\\d\\d-\\d\\d" );
		
		String string1 = "Jane's Birthday is 05-12-75\n" +
				 "Dave's Birthday is 11-04-68\n" +
				 "John's Birthday is 04-28-73\n" +
				 "Joe's Birthday is 12-17-77";
		
		// match regular expression to string and print matches
		
		Matcher matcher = expression.matcher( string1 );
		
		while ( matcher.find() )
			System.out.println( matcher.group() );
	}
}
