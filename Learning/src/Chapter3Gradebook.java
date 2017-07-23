
public class Chapter3Gradebook {
	
	String myCourseName;
	
	public void setCourseName(String Course)
	{
		myCourseName = Course;
	}
	
	private String getCourseName()
	{
		return myCourseName;
	}
	
	public void displayMessage()
	{
		System.out.printf("Welcome to the Grade Book for \n %s \n", getCourseName());
	}

}
