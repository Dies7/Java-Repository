package exercises;
import java.util.Scanner;
public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inches;
		double feet;
		double inchesRemainder;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an amount of inches >> ");
		inches = input.nextInt();
		feet = inches / 12;
		inchesRemainder = inches % 12;
		System.out.println(inches + " inches becomes " + feet + " feet and " + inchesRemainder + " inches.");
	}

}
