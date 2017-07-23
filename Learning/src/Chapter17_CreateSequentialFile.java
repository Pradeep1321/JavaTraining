
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Chapter17_CreateSequentialFile {

	private ObjectOutputStream output; // outputs data to file
	
	public void openFile()
	{
		try
		{
			output = new ObjectOutputStream( new FileOutputStream( "C:\\Data\\Learning\\Learning\\bin\\clients.ser" ) );
		}
		catch ( IOException ioException )
		{
			System.err.println( "Error opening file." );
		}
		
	}
	
	public void addRecords()
	{
		
		Chapter17_AccountRecordSerializable record;
		int accountNumber = 0;
		String firstName;
		String lastName;
		double balance;
		
		Scanner input = new Scanner( System.in );
		
		System.out.printf( "%s\n%s\n%s\n%s\n\n",
				"To terminate input, type the end-of-file indicator ",
				"when you are prompted to enter input.",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows type <ctrl> z then press Enter" );
		
		System.out.printf( "%s\n%s",
				"Enter account number (> 0), first name, last name and balance.", "? " );
		
		while ( input.hasNext() )
		{
			try
			{
				accountNumber = input.nextInt(); // read account number
				firstName = input.next(); // read first name
				lastName = input.next(); // read last name
				balance = input.nextDouble(); // read balance
				
				if ( accountNumber > 0 )
				{
					record = new Chapter17_AccountRecordSerializable( accountNumber, firstName, lastName, balance );
					output.writeObject( record );
				}
				else
				{
					System.out.println( "Account number must be greater than 0." );
				}
			}
			catch ( IOException ioException )
			{
				System.err.println( "Error writing to file." );
				return;
			}
			catch ( NoSuchElementException elementException )
			{
				System.err.println( "Invalid input. Please try again." );
				input.nextLine();
			}
			
			
			System.out.printf( "%s %s\n%s", "Enter account number (>0),", "first name, last name and balance.", "? " );
			
			}
		
	}
	
	public void closeFile()
	{
		try
		{
			if ( output != null )
			{
				output.close();			
			}
		}
		catch ( IOException ioException )
		{
			System.err.println( "Error closing file." );
		}
	}
	
}
