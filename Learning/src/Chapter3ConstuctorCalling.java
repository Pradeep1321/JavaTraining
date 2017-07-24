/**
 * @author PNimmanapalli
 * The empty parentheses after “new GradeBook” indicate a call to the class’s constructor without arguments. By default, the
compiler provides a default constructor with no parameters in any class that does not explicitly
include a constructor. When a class has only the default constructor, its instance
variables are initialized to their default values.
 *
 * An important difference between constructors and methods is that constructors
cannot return values, so they cannot specify a return type (not even void). Normally, constructors
are declared public. If a class does not include a constructor, the class’s instance
variables are initialized to their default values. If you declare any constructors for a class, the
Java compiler will not create a default constructor for that class. Thus, we can no longer create
a GradeBook object with new GradeBook() as we did in the earlier examples.
 * 
 * 
 * A static method can call only other static methods of the same class directly (i.e.,
using the method name by itself) and can manipulate only static variables in the same
class directly. To access the class’s non-static members, a static method must use a reference to an object of the class
 * Recall that static methods relate to a class as a whole,
whereas non-static methods are associated with a specific instance (object) of the class
and may manipulate the instance variables of that object. Many objects of a class, each
with its own copies of the instance variables, may exist at the same time. Suppose a static
method were to invoke a non-static method directly. How would the method know
which object’s instance variables to manipulate? What would happen if no objects of the
class existed at the time the non-static method was invoked? Thus, Java does not allow
a static method to access non-static members of the same class directly.

 *
 *
 */
public class Chapter3ConstuctorCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chapter3Constructor myGrade1 = new Chapter3Constructor("Java1 object learning");
		Chapter3Constructor myGrade2 = new Chapter3Constructor("Java2 object learning");
		
		System.out.println("The Value of the Coursename before assigning extenally is ");
		myGrade1.displayCourseName();
		
		
		System.out.println("The Value of the Coursename after assigning extenally is ");
		myGrade1.setCourseName("Setting externally Course Name for Grade 1");
		myGrade1.displayCourseName();
		
		
		
	}

}
