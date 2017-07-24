/**
 * @author PNimmanapalli
class String’s split method, which breaks a String into its component tokens. Tokens are separated from one another by delimiters,
typically white-space characters such as space, tab, newline and carriage return.

 
 *
 *
 */


// StringTokenizer object used to tokenize strings.

import java.util.Scanner;
import java.util.StringTokenizer;


public class Chapter16_Tokenization {

	public static void main( String[] args )
	{
		
		Scanner scanner = new Scanner( System.in );
		System.out.println( "Enter a sentence and press Enter" );
		String sentence = scanner.nextLine();
		
		String[] tokens = sentence.split( " " );
		
		System.out.printf( "Number of elements: %d\nThe tokens are:\n", tokens.length );
		
		for ( String token : tokens )
			System.out.println( token );
		
		
	}
	
	
}
