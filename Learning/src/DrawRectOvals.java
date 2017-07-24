import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRectOvals extends JPanel 
{

	private int Choice;
	
	public DrawRectOvals(int userChoice)
	{
		Choice = userChoice;
	}
	
	// draws a cascade of shapes starting from the top-left corner
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for( int i=0 ; i < 10 ; i++)
		{
			switch (Choice)
			{
			case 1:
				g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
				break;
			case 2:
				g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
				break;
			case 3:
				g.drawOval(125 - i *10  , 125 - i * 10   , 10 + i *20 , 10 + i *20 );
			
			}
		}

		
	}

}
