//BalanceInquiry.java
//Represents a balance inquiry ATM transaction

public class Chapter13_BalanceInquiry extends Chapter13_Transaction
{
	// BalanceInquiry constructor
	public Chapter13_BalanceInquiry( int userAccountNumber, Chapter13_Screen atmScreen, 
			Chapter13_BankDatabase atmBankDatabase )
	{
	   super( userAccountNumber, atmScreen, atmBankDatabase );
	} // end BalanceInquiry constructor
	
	// performs the transaction
	@Override
	public void execute()
	{
	   // get references to bank database and screen
		Chapter13_BankDatabase bankDatabase = getBankDatabase();
		Chapter13_Screen screen = getScreen();
	
	   // get the available balance for the account involved
	   double availableBalance = 
	      bankDatabase.getAvailableBalance( getAccountNumber() );
	
	   // get the total balance for the account involved
	   double totalBalance = 
	      bankDatabase.getTotalBalance( getAccountNumber() );
	   
	   // display the balance information on the screen
	   screen.displayMessageLine( "\nBalance Information:" );
	   screen.displayMessage( " - Available balance: " ); 
	   screen.displayDollarAmount( availableBalance );
	   screen.displayMessage( "\n - Total balance:     " );
	   screen.displayDollarAmount( totalBalance );
	   screen.displayMessageLine( "" );
	} // end method execute
} // end class BalanceInquiry
