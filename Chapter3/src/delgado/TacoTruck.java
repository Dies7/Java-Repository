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
		final double tacoPrice = 2.25, burritoPrice = 3.45, chimichangaPrice = 6.20, fajitaPrice = 7.35, churroPrice = 1.35, spanishRicePrice = 1, enchiladaPrice = 5.60, beanPrice = 0.75, fishTacoPrice = 3, nachoPrice = 2.75;
		double tacoOrdered = 0, burritoOrdered = 0, chimichangaOrdered = 0, fajitaOrdered = 0, churroOrdered = 0,spanishRiceOrdered = 0, enchiladaOrdered = 0, beanOrdered = 0, fishTacoOrdered = 0, nachoOrdered = 0;
		int tacos, burritos, chimichangas, fajitas, churros, spanishRice, enchiladas, beans, fishTacos, nachos;
		double tacoOrder, burritoOrder, chimichangaOrder, fajitaOrder, churroOrder, spanishRiceOrder, enchiladaOrder, beanOrder, fishTacoOrder, nachoOrder;
		
		JOptionPane.showMessageDialog(null, "Here is our menu, please choose an item to order. >>>", "Welcome", JOptionPane.INFORMATION_MESSAGE);
		
		
		String menuString = JOptionPane.showInputDialog(null, "Please enter the food item you want to order,\n make sure to type your order EXACTLY \n the way it was on the menu, otherwise\n your order will not work or be placed.", "Order Form", JOptionPane.INFORMATION_MESSAGE);
	    
		if(menuString.equals("tacos"))
		{
			String stringTacos = JOptionPane.showInputDialog(null, "How many tacos do you want?", "Taco Amount", JOptionPane.QUESTION_MESSAGE);
			tacoOrdered = Double.parseDouble(stringTacos);
			
		}
		else if(menuString.equals("burritos"))
		{
			String stringBurritos = JOptionPane.showInputDialog(null, "How many burritos do you want?", "Burrito Amount", JOptionPane.QUESTION_MESSAGE);
			burritoOrdered = Double.parseDouble(stringBurritos);
		}
		else if(menuString.equals("chimichangas"))
		{
			String stringChimichangas = JOptionPane.showInputDialog(null, "How many chimichangas do you want?", "Chimichanga Amount", JOptionPane.QUESTION_MESSAGE);
			chimichangaOrdered = Double.parseDouble(stringChimichangas);
		}
		else if(menuString.equals("fajitas"))
		{
			String stringFajitas = JOptionPane.showInputDialog(null, "How many fajitas do you want?", "Fajita Amount", JOptionPane.QUESTION_MESSAGE);
			fajitaOrdered = Double.parseDouble(stringFajitas);
		}
		else if(menuString.equals("churros"))
		{
			String stringChurros = JOptionPane.showInputDialog(null, "How many churros do you want?", "Churro Amount", JOptionPane.QUESTION_MESSAGE);
			churroOrdered = Double.parseDouble(stringChurros);
		}
		else if(menuString.equals("spanish rice"))
		{
			String stringSpanishRice = JOptionPane.showInputDialog(null, "How many orders of spanish rice do you want?", "Spanish Rice Amount", JOptionPane.QUESTION_MESSAGE);
			spanishRiceOrdered = Double.parseDouble(stringSpanishRice);
		}
		else if(menuString.equals("enchiladas"))
		{
			String stringEnchiladas = JOptionPane.showInputDialog(null, "How many enchiladas do you want?", "Enchilada Amount", JOptionPane.QUESTION_MESSAGE);
			enchiladaOrdered = Double.parseDouble(stringEnchiladas);
		}
		else if(menuString.equals("beans"))
		{
			String stringBeans = JOptionPane.showInputDialog(null, "How many orders of beans do you want?", "Bean Amount", JOptionPane.QUESTION_MESSAGE);
			beanOrdered = Double.parseDouble(stringBeans);
		}
		else if(menuString.equals("fish tacos"))
		{
			String stringFishTacos = JOptionPane.showInputDialog(null, "How many fish tacos do you want?", "Fish Taco Amount", JOptionPane.QUESTION_MESSAGE);
			fishTacoOrdered = Double.parseDouble(stringFishTacos);
		}
		else if(menuString.equals("nachos"))
		{
			String stringNachos = JOptionPane.showInputDialog(null, "How many orders of nachos do you want?", "Nacho Amount", JOptionPane.QUESTION_MESSAGE);
			nachoOrdered = Double.parseDouble(stringNachos);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "We're sorry, but we don't have the item you selected, please try again.");
		}
		tacoOrder = tacoOrdered * tacoPrice;
		tacoTruck();
		
	}
	public static void tacoTruck()
	{
		
		 JOptionPane.showMessageDialog(null, "  _______________________________________" +
				                           "\n  |                                    MEXI TRUCK                               |" +
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

	}
	public static void price()
	{
		
	}

}
