/**
 * 
 */
package delgado;
import javax.swing.JOptionPane;
/**
 * @author ed131193
 *
 */
public class TacoTruck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tacoTruck();
		displayFood();
	}
	public static void tacoTruck()
	{
		 JOptionPane.showMessageDialog(null, "  _______________________________________" +
				                           "\n  |                                       TACOS                                      |" +
				 						   "\n  |                ___________________                              |" +
				 						   "\n  |               |                                            |                             |" +
				 						   "\n  |               |___________________|                             |" +
				 						   "\n  |                                                                                          |------------|" +  
				 						   "\n  |                                                                                                           |" +
				 						   "\n  |                                                                                                           |" +
				 						   "\n  |                                                                                                           |" +
				 						   "\n|-----------------------------------------------------------------------------------|" +
				 						   "\n                 |______|                                        |______|");
	}
	public static void menu()
	{
		String tacoString, burritoString;
		final double tacoPrice = 1.25;
		final double burritoPrice = 3.35;
		double tacoOrdered, burritoOrdered;
		int tacos, burritos;
	}
	public static void displayFood(String tacoString, String burritoString, final double tacoPrice, final double burritoPrice, double tacoOrdered, double burritoOrdered, int tacos, int burritos)
	{
		tacoString = JOptionPane.showInputDialog(null, "How many tacos do you want?", "Taco Amount", JOptionPane.INFORMATION_MESSAGE);
		tacos = Integer.parseInt(tacoString);
		tacoOrdered = tacos * tacoPrice;
		burritoString = JOptionPane.showInputDialog(null, "How many burritos do you want?", "Burrito Amount", JOptionPane.INFORMATION_MESSAGE);
		burritoOrdered = burritos * burritoPrice;
		burritos = Integer.parseInt(burritoString);
	}
	public static void price()
	{
		
	}

}
