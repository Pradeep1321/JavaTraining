
public class Chapter3Constructor {
	private String courseName;
	
	public Chapter3Constructor (String Name)
	{
		courseName = Name;
	}

	public void setCourseName(String Name)
	{
		courseName = Name;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void displayCourseName()
	{
		System.out.printf("The course that is entered is %s \n", courseName);
	}
	
}
