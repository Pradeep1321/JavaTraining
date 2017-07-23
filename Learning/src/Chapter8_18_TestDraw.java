import javax.swing.JFrame;

public class Chapter8_18_TestDraw {

	 public static void main( String[] args )
	 {
		 Chapter8_18_DrawPanel panel = new Chapter8_18_DrawPanel();
		 JFrame application = new JFrame();
	
		 application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 application.add( panel );
		 application.setSize( 300, 300 );
		 application.setVisible( true );
	 }	
}
