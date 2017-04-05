package gameZone;
import javax.swing.JOptionPane;
public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   displayOutcome();
	   SalaryDialog.salary();
	}
	public static void displayOutcome()
	{
		 final int MIN = 1;
		    final int MAX = 5;
		    int random;
		    int guess;
		    boolean isMatch;
		    random = MIN + (int)(Math.random() * MAX);
		    String guessString;
		    guessString = JOptionPane.showInputDialog(null, "Guess my number between " + MIN + " and " +
		    MAX, "Random guess", JOptionPane.INFORMATION_MESSAGE);
		    guess = Integer.parseInt(guessString);
		    isMatch = guess == random;
		    JOptionPane.showMessageDialog(null, "Your guess was " + (random-guess) + " number(s) away from the random number.");
		    JOptionPane.showMessageDialog(null, "The number was " + random + ". The result is " + isMatch + ".");
	}}
