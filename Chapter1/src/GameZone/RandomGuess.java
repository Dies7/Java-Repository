package GameZone;

import javax.swing.JOptionPane;


public class RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Guess a number between 1 and 10, then press 'Ok'.");
		JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10)));
	}

}
