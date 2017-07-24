import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//This program reads a text file and displays each record.

public class Chapter17_ReadTextFile {

	
	private Scanner input;
	
	// enable user to open file
	public void openFile()
	{
		
		try
		{
			input = new Scanner( new File( "C:\\Data\\Learning\\Learning\\bin\\clients.txt" ) );
		}
		catch ( FileNotFoundException fileNotFoundException )
		{
			System.err.println( "Error opening file." );
			System.exit( 1 );
		}
	}
	
	// read record from file
	public void readRecords()
	{
		Chapter17_AccountRecord record = new Chapter17_AccountRecord();
		
		System.out.printf( "%-10s%-12s%-12s%10s\n", "Account", "First Name", "Last Name", "Balance" );
		
		try
		{
			while ( input.hasNext() )
			{
				record.setAccount( input.nextInt() ); // read account number
				record.setFirstName( input.next() ); // read first name
				record.setLastName( input.next() ); // read last name
				record.setBalance( input.nextDouble() ); // read balance
				
				// display record contents
				System.out.printf( "%-10d%-12s%-12s%10.2f\n",
				record.getAccount(), record.getFirstName(),
				record.getLastName(), record.getBalance() );
			}
		}
		catch ( NoSuchElementException elementException )
		{
				System.err.println( "File improperly formed." );
				input.close();
				System.exit( 1 );
		} // end catch
		catch ( IllegalStateException stateException )
		{
				System.err.println( "Error reading from file." );
				System.exit( 1 );
		} // end catch
	
	}

	 // close file and terminate application
	 public void closeFile()
	 {
	 if ( input != null )
		 input.close();
	 }
	 
}
