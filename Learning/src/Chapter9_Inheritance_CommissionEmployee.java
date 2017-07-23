/**
 *Java supports only single inheritance, in which each class is derived from exactly one direct superclass.
 * 
 *
 9.3 protected Members
 Using protected access offers an intermediate level of access between public and private. A superclass’s protected members can be accessed
by members of that superclass, by members of its subclasses and by members of other
classes in the same package—protected members also have package access.

All public and protected superclass members retain their original access modifier
when they become members of the subclass—public members of the superclass become
public members of the subclass, and protected members of the superclass become protected
members of the subclass.superclass’s private members are not accessible outside
the class itself.

When a subclass method overrides an inherited superclass method, the superclass method can be accessed from the subclass by
preceding the superclass method name with keyword super and a dot (.) separator

9.4 Relationship between Superclasses and Subclasses

9.4.1 Creating and Using a CommissionEmployee Class
@override : 
The ability of a subclass to override a method allows a class to inherit from a superclass whose behavior is "close enough" and then to modify behavior as needed.
The overriding method has the same name, number and type of parameters, and return type as the method that it overrides.
If you don’t explicitly specify which class a new class extends, the class extends Object implicitly

Constructors are not inherited, However, a superclass’s constructors are still available to subclasses
the first task of any subclass constructor is to call its direct superclass’s constructor, either explicitly or implicitly (if no constructor call is specified), to ensure that the instance variables
inherited from the superclass are initialized properly
To override a superclass method, a subclass must declare a method
with the same signature (method name, number of parameters, parameter types and order
of parameter types) as the superclass method—

@Override annotation to indicate that method toString should
override a superclass method. Annotations have several purposes. For example, when you
attempt to override a superclass method, common errors include naming the subclass
method incorrectly, or using the wrong number or types of parameters in the parameter
list. Each of these problems creates an unintentional overload of the superclass method. If
you then attempt to call the method on a subclass object, the superclass’s version is
invoked and the subclass version is ignored—potentially leading to subtle logic errors

When the compiler encounters a method declared with @Override, it compares the
method’s signature with the superclass’s method signatures. If there isn’t an exact match,
the compiler issues an error message, such as “method does not override or implement a
method from a supertype.”

It’s a syntax error to override a method with a more restricted access modifier—a public
method of the superclass cannot become a protected or private method in the subclass;
a protected method of the superclass cannot become a private method in the subclass.

Once a method is declared public in a superclass, the method remains public for all that class’s direct and indirect subclasses.

9.5 Constructors in Subclasses
Java ensures that even if a constructor does not assign a value to an instance variable, the
variable is still initialized to its default value (e.g., 0 for primitive numeric types, false
for booleans, null for references).

When a superclass variable contains a reference to a subclass object, and
that reference is used to call a method, the subclass version of the method is called.
 
 **/

// private instance variables.
public class Chapter9_Inheritance_CommissionEmployee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	public Chapter9_Inheritance_CommissionEmployee( String first, String last, String ssn, double sales, double rate )
	{
		 // implicit call to Object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales( sales ); // validate and store gross sales
		setCommissionRate( rate ); // validate and store commission rate
	} // end five-argument CommissionEmployee constructor
	
	public void setFirstName( String first )
	{
		firstName = first; // should validate
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName( String last )
	{
		lastName = last;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setSocialSecurityNumber( String ssn )
	{
		socialSecurityNumber = ssn;
	}
	
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	public void setGrossSales( double sales )
	{
		if ( sales >= 0.0 )
			grossSales = sales;
		else
			 throw new IllegalArgumentException("Gross sales must be >= 0.0" );
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public void setCommissionRate( double rate )
	{
		if ( rate > 0.0 && rate < 1.0 )
			commissionRate = rate;
		else
			 throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0" );
	}
	
	public double getCommissionRate()
	{
		return commissionRate;
	}
	
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	}
	
	@Override // indicates that this method overrides a superclass method
	public String toString()
	{
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"commission employee", getFirstName() , getLastName() , 
				"social security number", getSocialSecurityNumber() ,
				"gross sales", getGrossSales() ,
				"commission rate",getCommissionRate() );
	}
}
