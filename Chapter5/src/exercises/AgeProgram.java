package exercises;
import java.util.Scanner;
public class AgeProgram {
//Evan Dies
//This class gives you messages based on your age via a Scanner.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age? >>>>>>");
		age = input.nextInt();
		if(age >= 0 & age <= 11)
		{
			System.out.println("You're pretty young, I'm suprised you can\n even manage to use this program.");
		}
		if(age == 12)
		{
			System.out.println("Oh dear you're 12, please try NOT to be obnoxious\n like 12 year olds usually are.");
		}
		if(age >= 13 & age <= 17)
		{
			System.out.println("Ah, you're finally a teen,\n this will either be the best\n or worst years of your life, enjoy!");
		}
		if(age == 18)
		{
			System.out.println("Congratulations! You're now legally an adult!\n Time for you to have a bunch of responsibilities\n you probably didn't ask for!");
		}
		if(age >= 19 & age <= 30)
		{
			System.out.println("You're still young,\n go on,\n have fun and enjoy life.");
		}
		if(age >= 31 & age <= 50)
		{
			System.out.println("You're starting to age,\n start making smart investments for your future.");
		}
		if(age >= 51 & age <= 65)
		{
			System.out.println("You're close to retiring, hopefully you've been saving up.");
		}
		if(age >= 66 & age <= 100)
		{
			System.out.println("I fear the end is nye for you,\n with your money I hope you've been saving up,\n go enjoy your remaining days in grandeur.");
		}
		if(age >= 101)
		{
			System.out.println("You probably should not be operating a computer\n or even be alive at this point!");
		}
	}

}
