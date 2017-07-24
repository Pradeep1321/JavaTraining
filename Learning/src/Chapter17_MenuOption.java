
public enum Chapter17_MenuOption {
	
	// declare contents of enum type
	ZERO_BALANCE( 1 ), 	CREDIT_BALANCE( 2 ), DEBIT_BALANCE( 3 ), END( 4 );
	
	private final int value; // current menu option
	
	Chapter17_MenuOption( int valueOption )
	{
		value = valueOption;
	}
	public int getValue()
	{
		return value;
	}

}
