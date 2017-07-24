
/**
 * @author PNimmanapalli
 *
 
 * A static method is special, because you can call it without first creating an object of the class in which the method is declared.
 * 
 * Typically, you cannot call a method that belongs to another class until you create an object of that class,
 * 
 * Keyword new creates a new object of the class specified to the right of the keyword (i.e., GradeBook). The parentheses to the right of GradeBook
are required. As you’ll learn in Section 3.6, those parentheses in combination with a class name represent a call to a constructor, which is similar to a method but is used only at the
time an object is created to initialize the object’s data. You’ll see that data can be placed in the parentheses to specify initial values for the object’s data.
 * 
 * 
 * The default value for a field of type String (like courseName in this example) is null
 * 
 * Primitive-type instance variables are initialized by default—variables of types byte, char, short, int, long, float and
double are initialized to 0, and variables of type boolean are initialized to false.
 * *
 */

import java.util.Scanner;

public class Chapter3GradeBookTest {

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Chapter3Gradebook myGradeBook = new Chapter3Gradebook();
		System.out.printf("Course Name before setting from Variable \n", myGradeBook.myCourseName);
		// The below function can not be called as the getCourseName() is private and hence can not be accessed 
		//System.out.printf("Course Name before setting from the getCourseName function \n", myGradeBook.getCourseName());
		System.out.println("Please enter the course name: ");
		myGradeBook.setCourseName(input.nextLine());
		System.out.println();
		myGradeBook.displayMessage();
		input.close();
		
	}

}
