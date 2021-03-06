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
//Evan Dies
//This class offers you a menu at a taco truck via a gui.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double tacoPrice = 2.25, burritoPrice = 3.45, chimichangaPrice = 6.20, fajitaPrice = 7.35, churroPrice = 1.35, spanishRicePrice = 1, enchiladaPrice = 5.60, beanPrice = 0.75, fishTacoPrice = 3, nachoPrice = 2.75;
		double tacoOrdered = 0, burritoOrdered = 0, chimichangaOrdered = 0, fajitaOrdered = 0, churroOrdered = 0,spanishRiceOrdered = 0, enchiladaOrdered = 0, beanOrdered = 0, fishTacoOrdered = 0, nachoOrdered = 0;
		double tacoOrder = 0, burritoOrder = 0, chimichangaOrder = 0, fajitaOrder = 0, churroOrder = 0, spanishRiceOrder = 0, enchiladaOrder = 0, beanOrder = 0, fishTacoOrder = 0, nachoOrder = 0;
		String choice;
		double totalOfTotals;
		
		JOptionPane.showMessageDialog(null, "Here is our menu, please choose an item to order. >>>", "Welcome", 
				JOptionPane.INFORMATION_MESSAGE);
		do{
			JOptionPane.showMessageDialog(null, "Taco $2.25\nFish Taco $3.00\nBurrito $3.45\nChimichanga $6.20\nEnchilada $5.60\nFajita $7.35\nNachos $2.75\nSpanish Rice $1.00\nBeans 0.75\nChurros $1.35");
			
			String menuString = JOptionPane.showInputDialog(null, "Please enter the food item you want to order\n the way it was on the menu,"
					+ " otherwise\n your order will not work or be placed.", "Order Form", JOptionPane.INFORMATION_MESSAGE);
		    
			if(menuString.equals("tacos") || menuString.equals("Tacos") || menuString.equals("Taco") || menuString.equals("taco"))
			{
				String stringTacos = JOptionPane.showInputDialog(null, "How many tacos do you want?", "Taco Amount", 
						JOptionPane.QUESTION_MESSAGE);
				tacoOrdered = Double.parseDouble(stringTacos);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (tacoOrder = tacoOrdered * tacoPrice) + 
						".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
				
			}
			else if(menuString.equals("burritos") || menuString.equals("burrito") || menuString.equals("Burrito") || menuString.equals("Burritos"))
			{
				String stringBurritos = JOptionPane.showInputDialog(null, "How many burritos do you want?", "Burrito Amount", 
						JOptionPane.QUESTION_MESSAGE);
				burritoOrdered = Double.parseDouble(stringBurritos);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (burritoOrder = burritoOrdered * burritoPrice) + 
						".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menuString.equals("chimichangas") || menuString.equals("chimichanga") || menuString.equals("Chimichanga") || menuString.equals("Chimichangas"))
			{
				String stringChimichangas = JOptionPane.showInputDialog(null, "How many chimichangas do you want?", "Chimichanga Amount", 
						JOptionPane.QUESTION_MESSAGE);
				chimichangaOrdered = Double.parseDouble(stringChimichangas);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (chimichangaOrder = chimichangaOrdered * chimichangaPrice) + ".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menuString.equals("fajitas") || menuString.equals ("fajita") || menuString.equals("Fajita") || menuString.equals("Fajitas"))
			{
				String stringFajitas = JOptionPane.showInputDialog(null, "How many fajitas do you want?", "Fajita Amount", 
						JOptionPane.QUESTION_MESSAGE);
				fajitaOrdered = Double.parseDouble(stringFajitas);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (fajitaOrder = fajitaOrdered * fajitaPrice) + 
						".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menuString.equals("churros") || menuString.equals("churro") || menuString.equals("Churro") || menuString.equals("Churros"))
			{
				String stringChurros = JOptionPane.showInputDialog(null, "How many churros do you want?", "Churro Amount", 
						JOptionPane.QUESTION_MESSAGE);
				churroOrdered = Double.parseDouble(stringChurros);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (churroOrder = churroOrdered * churroPrice) + 
						".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menuString.equals("spanish rice") || menuString.equals("Spanish rice") || menuString.equals("Spanish Rice") || menuString.equals("spanish Rice") || menuString.equals("spanishrice") || menuString.equals("Spanishrice") || menuString.equals("SpanishRice") || menuString.equals("spanishRice"))
			{
				String stringSpanishRice = JOptionPane.showInputDialog(null, "How many orders of spanish rice do you want?", "Spanish Rice Amount", JOptionPane.QUESTION_MESSAGE);
				spanishRiceOrdered = Double.parseDouble(stringSpanishRice);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (spanishRiceOrder = spanishRiceOrdered * spanishRicePrice) + ".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menuString.equals("enchiladas") || menuString.equals("enchilada") || menuString.equals("Enchilada") || menuString.equals("Enchiladas"))
			{
				String stringEnchiladas = JOptionPane.showInputDialog(null, "How many enchiladas do you want?", "Enchilada Amount", 
						JOptionPane.QUESTION_MESSAGE);
				enchiladaOrdered = Double.parseDouble(stringEnchiladas);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (enchiladaOrder = enchiladaOrdered * enchiladaPrice) + 
						".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menuString.equals("beans") || menuString.equals("bean") || menuString.equals("Bean") || menuString.equals("Beans"))
			{
				String stringBeans = JOptionPane.showInputDialog(null, "How many orders of beans do you want?", "Bean Amount",
						JOptionPane.QUESTION_MESSAGE);
				beanOrdered = Double.parseDouble(stringBeans);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (beanOrder = beanOrdered * beanPrice) + 
						".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menuString.equals("fish tacos") || menuString.equals("fish taco") || menuString.equals("fishtaco") || menuString.equals("fishtacos") || menuString.equals("Fish taco") || menuString.equals("Fish Taco") || menuString.equals("fish Taco") || menuString.equals("Fish tacos") || menuString.equals("Fish Tacos") || menuString.equals("fish Tacos") || menuString.equals("Fishtaco") || menuString.equals("FishTaco") || menuString.equals("fishTaco") || menuString.equals("Fishtacos") || menuString.equals("FishTacos") || menuString.equals("fishTacos"))
			{
				String stringFishTacos = JOptionPane.showInputDialog(null, "How many fish tacos do you want?", "Fish Taco Amount", 
						JOptionPane.QUESTION_MESSAGE);
				fishTacoOrdered = Double.parseDouble(stringFishTacos);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (fishTacoOrder = fishTacoOrdered * fishTacoPrice) + 
						".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(menuString.equals("nachos") || menuString.equals("nacho") || menuString.equals("Nacho") || menuString.equals("Nachos"))
			{
				String stringNachos = JOptionPane.showInputDialog(null, "How many orders of nachos do you want?", "Nacho Amount", 
						JOptionPane.QUESTION_MESSAGE);
				nachoOrdered = Double.parseDouble(stringNachos);
				JOptionPane.showMessageDialog(null, "Your order will cost you $" + (nachoOrder = nachoOrdered * nachoPrice) + 
						".", "Order Cost", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "We're sorry, but we don't have the item you selected, please try again.");
			}
			 choice = JOptionPane.showInputDialog(null, "Would you like to order something else yes or no?", 
					 JOptionPane.QUESTION_MESSAGE);
			
		} while(choice.equals("Yes") || choice.equals("yes") || choice.equals("y") || choice.equals("Y"));
		totalOfTotals = tacoOrder + burritoOrder + chimichangaOrder + fajitaOrder + churroOrder + spanishRiceOrder + enchiladaOrder + beanOrder + fishTacoOrder + nachoOrder;
		JOptionPane.showMessageDialog(null, "The total price of your order is $" + totalOfTotals);
		JOptionPane.showMessageDialog(null, "Thanks for ordering!");
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
	
}
