package exercises;
import javax.swing.JOptionPane;
public class Initials {

	public static void main(String[] args) {
		//Evan Dies 3 April 2017
		String fInitString, mInitString, lInitString;
		fInitString = JOptionPane.showInputDialog(null, "Enter First Initial");
		mInitString = JOptionPane.showInputDialog(null, "Enter Middle Initial");
		lInitString = JOptionPane.showInputDialog(null, "Enter Last Initial");
		JOptionPane.showMessageDialog(null, "Your initials are " + fInitString + "." + mInitString + "." + lInitString + ".");
	}

}
