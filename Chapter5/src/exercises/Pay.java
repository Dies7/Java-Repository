package exercises;
import javax.swing.JOptionPane;
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		skill();
	}
	public static void skill()
	{
		String skillLevelString;
		int skillLevelInt;
		String insuranceLevelString;
		int insuranceLevelInt;
		String hoursWorkedString;
		double hoursWorkedDouble;
		double totalGrossPay;
		double totalNetPay;
		double deduction;
		int skillAnswer;
		skillLevelString = JOptionPane.showInputDialog(null, "What skill level are you, 1, 2, or 3?");
		skillLevelInt = Integer.parseInt(skillLevelString);
		
		if(skillLevelInt == 1)
		{
			hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
			hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
			totalGrossPay = 17 * hoursWorkedDouble;
			JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay);
		}		
		if(skillLevelInt == 2)
		{
			insuranceLevelString = JOptionPane.showInputDialog(null, "What insurance do you have, 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString);
			if(insuranceLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay + 
				", subtracting insurance for level 1 " + "making your total net pay equal $" + totalNetPay);
			}	
			if(insuranceLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay + 
				", subtracting insurance for level 2 " + "making your total net pay equal $" + totalNetPay);
			}
			if(insuranceLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10;
				String retirementString = JOptionPane.showInputDialog(null, "3% retirement option Yes or No?");
				if(retirementString.equals("Yes"))
				{
					totalNetPay = totalGrossPay * 0.97;
					JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay + 
					", subtracting insurance for level 3 and retirement fee " + "making your total net pay equal $" + totalNetPay);
				}
				if(retirementString.equals("No"))
				{
					JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay + 
					", subtracting insurance for level 3 " + "making your total net pay equal $" + totalNetPay);
				}
			}	
		}		
		if(skillLevelInt == 3)
		{
			insuranceLevelString = JOptionPane.showInputDialog(null, "What insurance do you have, 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString);
			if(insuranceLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 22 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay + 
				", subtracting insurance for level 1 " + "making your total net pay equal $" + totalNetPay);
			}		
			if(insuranceLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 22 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay + 
				", subtracting insurance for level 2 " + "making your total net pay equal $" + totalNetPay);
			}				
			if(insuranceLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10;
				String retirementString = JOptionPane.showInputDialog(null, "3% retirement option Yes or No?");
				if(retirementString.equals("Yes"))
				{
					totalNetPay = totalGrossPay * 0.97;
					JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay + 
					", subtracting insurance for level 3 and retirement fee " + "making your total net pay equal $" + totalNetPay);
				}
				if(retirementString.equals("No"))
				{
					JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is $" + totalGrossPay + 
					", subtracting insurance for level 3 " + "making your total net pay equal $" + totalNetPay);
				}
			}	
		}		
	}
	public static void insurance()
	{
		
	}
	
}
