/**
 * @author PNimmanapalli
 *
 * * Every object can access a reference to itself with keyword this (sometimes called the this
reference). When a non-static method is called for a particular object, the method’s body
implicitly uses keyword this to refer to the object’s instance variables and other methods.

you can also use keyword this explicitly in a non-static method’s body

keyword this cannot be used in a static method

A source-code file can contain only one public class—otherwise, a compilation error occurs
Non-public classes can be used only by other classes in the same package

Once you declare any constructors in a class, the compiler will not provide a default constructor.
 * 
 * When one object of a class has a reference to another object of the same class, the first object
can access all the second object’s data and methods (including those that are private).

Ensure that you do not include a return type in a constructor definition. Java allows other
methods of the class besides its constructors to have the same name as the class and to specify
return types. Such methods are not constructors and will not be called when an object of
the class is instantiated.

Set methods are also commonly called mutator methods,

because they typically change an object’s state—i.e., modify the values of instance variables.
Get methods are also commonly called accessor methods or query methods

Predicate Methods
Another common use for accessor methods is to test whether a condition is true or false—
such methods are often called predicate methods.

8.8 Composition
A class can have references to objects of other classes as members. This is called composition
and is sometimes referred to as a has-a relationship.

8.9 Enumerations:
1. enum constants are implicitly final, because they declare constants that shouldn’t
be modified.
2. enum constants are implicitly static.
3. Any attempt to create an object of an enum type with operator new results in a
compilation error.
'
In an enum declaration, it’s a syntax error to declare enum constants after the enum type’s
constructors, fields and methods.

 *
 */
public enum Chapter8_Book {
	
	// declare constants of enum type
	JHTP( "Java How to Program", "2012" ),
	CHTP( "C How to Program", "2007" ),
	IW3HTP( "Internet & World Wide Web How to Program", "2008" ),
	CPPHTP( "C++ How to Program", "2012" ),
	VBHTP( "Visual Basic 2010 How to Program", "2011" ),
	CSHARPHTP( "Visual C# 2010 How to Program", "2011" );
	
	// instance fields
	private final String title; // book title
	private final String copyrightYear; // copyright year
	
	// enum constructor
	Chapter8_Book ( String bookTitle, String year )
	 {
	 title = bookTitle;
	 copyrightYear = year;
	 } // end enum Book constructor
	
	 // accessor for field title
	 public String getTitle()
	 {
		 return title;
	 } // end method getTitle
	
	 // accessor for field copyrightYear
	 public String getCopyrightYear()
	 {
		 return copyrightYear;
	 } // end method getCopyrightYear

}
