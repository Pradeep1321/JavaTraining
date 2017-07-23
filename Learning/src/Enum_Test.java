
public enum Enum_Test {
	
	SOUP_CHICKEN(20),
	SOUP_MUTTON(30),
	SOUP_VEG(15),
	
	NOODLES_CHICKEN(50),
	NOODLES_VEG(25),
	
	RICE_CHICKEN(45),
	RICE_VEG(30);
	
	private int Value;
	
	private Enum_Test(int price)
	{
		this.Value = price;
	}

	public int getvalue()
	{
		return Value;
	}
}
