
public class Chapter9_Inheritance_BasePlusCommissionEmployee extends Chapter9_Inheritance_CommissionEmployee
{

	private double baseSalary;
	
	public Chapter9_Inheritance_BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate, double salary )
	{
		super( first, last, ssn, sales, rate );
		
		setBaseSalary( salary );
		
	}
	
	
	public void setBaseSalary( double salary )
	{
		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0" );
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	@Override // indicates that this method overrides a superclass method
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	}
	
	@Override // indicates that this method overrides a superclass method
	public String toString()
	{
		return String.format( "%s %s\n%s: %.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary() );
	}
}
