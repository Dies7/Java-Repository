package exercises;
import javax.swing.JOptionPane;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userChoice;
		int choiceInt;
		userChoice = JOptionPane.showInputDialog(null, "Please enter a number.");
		choiceInt = Integer.parseInt(userChoice);
		if((choiceInt%2)==0)//even
			JOptionPane.showMessageDialog(null, "You're number is even.");
		else//odd
			JOptionPane.showMessageDialog(null, "You're number is odd.");
		
	}

}
