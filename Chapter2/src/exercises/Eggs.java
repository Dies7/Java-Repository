package exercises;
import javax.swing.JOptionPane;
public class Eggs {

	public static void main(String[] args) {
		//Evan Dies 3 April 2017
		String eggsString;
		int eggs, eggsDozen, eggsRemainder,eggsLeftover;
		double eggsPrice;
		final double eggPrice = .45;
		final double eggDozenPrice = 3.25;
		eggsString = JOptionPane.showInputDialog(null, "How many eggs do you want?", "Egg Amount", JOptionPane.INFORMATION_MESSAGE);
		eggs = Integer.parseInt(eggsString);
		eggsDozen = eggs / 12;
		eggsRemainder = eggs % 12;
		eggsPrice = eggsRemainder * eggPrice + eggsDozen * eggDozenPrice;
		JOptionPane.showMessageDialog(null, "You ordered " + eggs + " eggs." +  "\nThat's " + eggsDozen + " dozen at $3.25 per dozen and " + eggsRemainder + " loose egg(s) at 45 cents each for a total of $" + eggsPrice + ".");
	}

}
