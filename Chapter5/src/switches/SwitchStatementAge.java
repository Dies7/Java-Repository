package switches;

import java.util.Scanner;

public class SwitchStatementAge {
//Evan Dies
//This class tells you who you are based in your scanned ID (if you're ID number is in the class) via a scanner.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentNumber, choice;
		String confirm = null;
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Scan your ID card. >>>> ");
			studentNumber = input.nextInt();
			switch(studentNumber)
			{
			case 138992:
				System.err.println("You are Dusty.");
				break;
			case 131193:
				System.err.println("You are Evan");
				break;
			case 122190:
				System.err.print("You are Brandon");
				break;
			case 308508:
				System.err.println("You are AshLynn");
				break;
			case 304275:
				System.err.println("You are Gairren");
				break;
			case 112006:
				System.err.println("You are Nick");
				break;
			case 138076:
				System.err.println("You are Alex");
				break;
			}
		System.out.println("Would you like to scan another?");
		choice = 1;
		}while(choice == 1);
	}

}
