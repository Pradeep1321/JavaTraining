
public class Chapter17_CreateSequentialFileTest {

	public static void main( String[] args )
	{
		Chapter17_CreateSequentialFile application = new Chapter17_CreateSequentialFile();
		
		application.openFile();
		application.addRecords();
		application.closeFile();
	}
	
}
