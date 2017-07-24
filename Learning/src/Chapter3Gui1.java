import javax.swing.JOptionPane;

public class Chapter3Gui1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// prompt user to enter name
		String name = JOptionPane.showInputDialog("What is Your Name");
		
		// create the message
		String message = String.format(" Welcome, %s to Java Programming ", name);
		
		// display the message to welcome the user by name
		JOptionPane.showMessageDialog(null, message);
		
	}

}
