// to draw random lines.
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class Chapter8_18_DrawPanel extends JPanel
{

	private Random randomNumbers = new Random();
	private Chpater8_18_MyLine[] lines; // array of lines
	
	// constructor, creates a panel with random shapes
	public Chapter8_18_DrawPanel()
	{
		setBackground( Color.WHITE );
	
		lines = new Chpater8_18_MyLine[ 5 + randomNumbers.nextInt( 5 ) ];
	
		 // create lines
		 for ( int count = 0; count < lines.length; count++ )
		 {
			 // generate random coordinates
			 int x1 = randomNumbers.nextInt( 300 );
			 int y1 = randomNumbers.nextInt( 300 );
			 int x2 = randomNumbers.nextInt( 300 );
			 int y2 = randomNumbers.nextInt( 300 );
			
			 // generate a random color
			 Color color = new Color( randomNumbers.nextInt( 256 ),
			 randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
			
			 // add the line to the list of lines to be displayed
			 lines[ count ] = new Chpater8_18_MyLine( x1, y1, x2, y2, color );
		 } // end for
	} // end DrawPanel constructor
		
		 // for each shape array, draw the individual shapes
	public void paintComponent( Graphics g )
	{
		 super.paintComponent( g );
		
		 // draw the lines
		 for ( Chpater8_18_MyLine line : lines )
			 line.draw( g );
	} // end method paintComponent
}
