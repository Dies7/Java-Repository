package gameZone;
import javax.swing.JOptionPane;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int computer = r.nextInt(3) + 1;
		int rock = 1, paper = 2, scissors = 3;
		String userPick, computerPick;
		String userAnswer, computerAnswer, result;
		int answerInt;
		
		userAnswer = JOptionPane.showInputDialog(null, "Choose \n1 for Rock\n2 for Paper\n3 for Scissors");
		answerInt = Integer.parseInt(userAnswer);
		
		if(answerInt == 1)//rock
			userAnswer = "rock";
		else
			if(answerInt == 2)//paper
				userAnswer = "paper";
			else//scissors
				userAnswer = "scissors";
		if(computer == 1)
			computerPick = "rock";
		else
			if(computer == 2)
				computerPick = "paper";
			else
				computerPick = "scissors";
		if(answerInt == 1);
			if(computer == 1)
				result = "Tie, stupid Human.";
			else
				if(computer == 2)
					result = "Computer wins, Humans are stupid.";
				else
					result = "Stupid computer, Humans rule.";
		if(answerInt == 2)
			if(computer == 1)
				result = "Stupid computer, Humans rule.";
			else
				if(computer == 2)
					result = "Tie, stupid Human.";
				else
					result = "Computer wins, Humans are stupid.";
		if(answerInt == 3)
			if(computer == 1)
				result = "Computer wins, Humans are stupid.";
			else
				if(computer == 2)
					result = "Stupid computer, Human wins.";
				else
					result = "Tie, stupid Human.";
		if(computer == 1)
			computerAnswer = "rock";
		else
			if(computer == 2)
				computerAnswer = "paper";
			else
				computerAnswer = "scissors";
		
		JOptionPane.showMessageDialog(null,  "You picked " + userAnswer + ". Computer picked " + computerAnswer + ". " + result);
	}

}
