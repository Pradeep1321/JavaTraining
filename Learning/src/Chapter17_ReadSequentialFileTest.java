
public class Chapter17_ReadSequentialFileTest {

	public static void main(String[] args) {
		
		Chapter17_ReadSequentialFile application = new Chapter17_ReadSequentialFile();
		
		application.openFile();
		application.readRecords();
		application.closeFile();
	}

}
