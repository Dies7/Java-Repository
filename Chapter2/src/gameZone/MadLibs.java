package gameZone;
import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color,wordEST,bodyPartPlural,animal,noun,pluralNoun;
		int a,b,c;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Welcome to MadLibs game.");
		
		System.out.println("Enter a color >> ");
		color = inputDevice.nextLine();
		
		System.out.println("Enter a word ending in 'est' >> ");
		wordEST = inputDevice.nextLine();
		
		System.out.println("Enter a body part that is plural >> ");
		bodyPartPlural = inputDevice.nextLine();
		
		System.out.println("Enter an animal >> ");
		animal = inputDevice.nextLine();
		
		System.out.println("Enter a noun >> ");
		noun = inputDevice.nextLine();
		
		System.out.println("Enter a plural noun >> ");
		pluralNoun = inputDevice.nextLine();
		
		System.out.println("Enter a number >> ");
		a = inputDevice.nextInt();
		
		System.out.println("Enter a number less than the previous >> ");
		b = inputDevice.nextInt();
		c = a - b;
		
		System.out.println("\n The " + color + " dragon is the " + wordEST + 
		"\n dragon of all. It has " + c + " " + bodyPartPlural + ", and a " + animal + 
		"\n shaped like a(n) " + noun + ". It loves to eat " + pluralNoun + 
		", \n although it will feast on nearly anything.");
	}

}
