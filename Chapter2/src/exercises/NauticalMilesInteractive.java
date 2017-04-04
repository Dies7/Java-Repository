package exercises;
import java.util.Scanner;
public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// Evan Dies 3 April 2017
		int miles;
		int kilometers;
		double nauticalMiles;
		double nauticalKilometers;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the amount of miles >> ");
		miles = input.nextInt();
		System.out.print("Please enter the amount of kilometers >> ");
		kilometers = input.nextInt();
		nauticalMiles = miles / 1.150779;
		nauticalKilometers = kilometers / 1.852;
		System.out.println("There are " + miles + " miles in " + nauticalMiles + " nautical miles, and " + kilometers + " kilometers in " + nauticalKilometers + " nautical miles.");
	}

}
