package exercises;
import java.util.Scanner;
public class PizzaChoice {
//Evan Dies
//This class offers you a pizza menu via a scanner.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice, choice2;
		int toppingChoice;
		double large = 10.99;
		double medium = 7.99;
		double small = 4.99;
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like pizza? Yes or No?");
		choice = input.nextLine();
		if("yes".equals(choice) ||"Yes".equals(choice)||"y".equals(choice) ||"Y".equals(choice))
		{
			System.out.println("You said " + choice + " to wanting pizza.");
			System.out.print("Please choose a topping: '1' for Hamburger, '2' for Pepperoni, '3' for Canadian Bacon, or '4' for no toppings.");
			toppingChoice = input.nextInt();
			if(toppingChoice == 1)
			{
				System.out.println("You said Hamburger Pizza, what size do you want? 'Small', 'Medium', or 'Large'?");
				choice2 = input.next();
				if(choice2.equals("small") ||choice2.equals("Small") ||choice2.equals("s") ||choice2.equals("S"))
				{
					System.out.println("You said you wanted a small hamburger pizza which will cost you $" + small + ", please pay now or else...");
				}
				else if(choice2.equals("medium") ||choice2.equals("Medium") ||choice2.equals("m") ||choice2.equals("M"))
				{
					System.out.println("You said you wanted a medium hamburger pizza which will cost you $" + medium + ", please pay now or else...");
				}
				else if(choice2.equals("large") ||choice2.equals("Large") ||choice2.equals("l") ||choice2.equals("L"))
				{
					System.out.println("You said you wanted a large hamburger pizza which will cost you $" + large + ", please pay now or else...");
				}
				else
				{
					System.out.println("Sorry, we don't have that size that you typed, please try again.");
				}
			}
			else if(toppingChoice == 2)
			{
				System.out.println("You said Pepperoni Pizza, what size do you want? 'Small', 'Medium', or 'Large'?");
				choice2 = input.next();
				if(choice2.equals("small") ||choice2.equals("Small") ||choice2.equals("s") ||choice2.equals("S"))
				{
					System.out.println("You said you wanted a small pepperoni pizza which will cost you $" + small + ", please pay now or else...");
				}
				else if(choice2.equals("medium") ||choice2.equals("Medium") ||choice2.equals("m") ||choice2.equals("M"))
				{
					System.out.println("You said you wanted a medium pepperoni pizza which will cost you $" + medium + ", please pay now or else...");
				}
				else if(choice2.equals("large") ||choice2.equals("Large") ||choice2.equals("l") ||choice2.equals("L"))
				{
					System.out.println("You said you wanted a large pepperoni pizza which will cost you $" + large + ", please pay now or else...");
				}
				else
				{
					System.out.println("Sorry, we don't have that size that you typed, please try again.");
				}
			}
			else if(toppingChoice == 3)
			{
				System.out.println("You said Canadian Bacon Pizza, what size do you want? 'Small', 'Medium', or 'Large'?");
				choice2 = input.next();
				if(choice2.equals("small") ||choice2.equals("Small") ||choice2.equals("s") ||choice2.equals("S"))
				{
					System.out.println("You said you wanted a small canadian bacon pizza which will cost you $" + small + ", please pay now or else...");
				}
				else if(choice2.equals("medium") ||choice2.equals("Medium") ||choice2.equals("m") ||choice2.equals("M"))
				{
					System.out.println("You said you wanted a medium canadian bacon pizza which will cost you $" + medium + ", please pay now or else...");
				}
				else if(choice2.equals("large") ||choice2.equals("Large") ||choice2.equals("l") ||choice2.equals("L"))
				{
					System.out.println("You said you wanted a large canadian bacon pizza which will cost you $" + large + ", please pay now or else...");
				}
				else
				{
					System.out.println("Sorry, we don't have that size that you typed, please try again.");
				}
			}
			else if(toppingChoice >= 4)
			{
				System.out.println("You said Plain Cheese Pizza, what size do you want? 'Small', 'Medium', or 'Large'?");
				choice2 = input.next();
				if(choice2.equals("small") ||choice2.equals("Small") ||choice2.equals("s") ||choice2.equals("S"))
				{
					System.out.println("You said you wanted a small plain cheese pizza which will cost you $" + small + ", please pay now or else...");
				}
				else if(choice2.equals("medium") ||choice2.equals("Medium") ||choice2.equals("m") ||choice2.equals("M"))
				{
					System.out.println("You said you wanted a medium plain cheese which will cost you $" + medium + ", please pay now or else...");
				}
				else if(choice2.equals("large") ||choice2.equals("Large") ||choice2.equals("l") ||choice2.equals("L"))
				{
					System.out.println("You said you wanted a large plain cheese pizza which will cost you $" + large + ", please pay now or else...");
				}
				else
				{
					System.out.println("Sorry, we don't have that size that you typed, please try again.");
				}
			}
			else if(toppingChoice != 1 ||toppingChoice != 2 ||toppingChoice != 3 ||toppingChoice !=4)
			{
				System.out.println("Sorry, we don't have that type of pizza your ordered, please try again.");
			}
		}
		else if("no".equals(choice) ||"No".equals(choice)||"n".equals(choice) ||"N".equals(choice))
		{
			System.out.println("You said " + choice + " to wanting pizza.");
			System.err.println("You must be crazy if you don't want pizza, try again.");
		}
		else
		{
			System.out.println("We need a yes or no answer, please try again.");
		}
	}

}
