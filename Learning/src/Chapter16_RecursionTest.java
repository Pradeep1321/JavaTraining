import java.util.Scanner;
public class Chapter16_RecursionTest {

	public static void main( String[] args )
	{
		Scanner scanner = new Scanner( System.in );
		System.out.println( "Please enter first name:" );
		String firstName = scanner.nextLine();
		System.out.println( "Please enter last name:" );
		String lastName = scanner.nextLine();
		System.out.println( "Please enter address:" );
		String address = scanner.nextLine();
		System.out.println( "Please enter city:" );
		String city = scanner.nextLine();
		System.out.println( "Please enter state:" );
		String state = scanner.nextLine();
		System.out.println( "Please enter zip:" );
		String zip = scanner.nextLine();
		System.out.println( "Please enter phone:" );
		String phone = scanner.nextLine();
		
		// validate user input and display error message
		System.out.println( "\nValidate Result:" );
		if ( !Chapter16_RegualrExp.validateFirstName( firstName ) )
			System.out.println( "Invalid first name" );
		else if (!Chapter16_RegualrExp.validateLastName( lastName ))
			System.out.println( "Invalid last name" );
		else if ( !Chapter16_RegualrExp.validateAddress( address ) )
			System.out.println( "Invalid address" );
		else if ( !Chapter16_RegualrExp.validateCity( city ) )
			System.out.println( "Invalid city" );
		else if ( !Chapter16_RegualrExp.validateState( state ) )
			System.out.println( "Invalid state" );
		else if ( !Chapter16_RegualrExp.validateZip( zip ) )
			System.out.println( "Invalid zip code" );
		else if ( !Chapter16_RegualrExp.validatePhone( phone ) )
			System.out.println( "Invalid phone number" );
		else
			System.out.println( "Valid input. Thank you." );

		
		
		
		
	}
}
