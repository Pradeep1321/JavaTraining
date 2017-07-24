//Transaction.java
//Abstract superclass Transaction represents an ATM transaction

public abstract class Chapter13_Transaction
{
	private int accountNumber; // indicates account involved
	private Chapter13_Screen screen; // ATM's screen
	private Chapter13_BankDatabase bankDatabase; // account info database
	
	// Transaction constructor invoked by subclasses using super()
	public Chapter13_Transaction( int userAccountNumber, Chapter13_Screen atmScreen, 
			Chapter13_BankDatabase atmBankDatabase )
	{
	   accountNumber = userAccountNumber;
	   screen = atmScreen;
	   bankDatabase = atmBankDatabase;
	} // end Transaction constructor
	
	// return account number 
	public int getAccountNumber()
	{
	   return accountNumber; 
	} // end method getAccountNumber
	
	// return reference to screen
	public Chapter13_Screen getScreen()
	{
	   return screen;
	} // end method getScreen
	
	// return reference to bank database
	public Chapter13_BankDatabase getBankDatabase()
	{
	   return bankDatabase;
	} // end method getBankDatabase
	
	// perform the transaction (overridden by each subclass)
	abstract public void execute();
} // end class Transaction

