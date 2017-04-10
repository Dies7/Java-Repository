package methodConstruction;
import javax.swing.JOptionPane;
public class page134Modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				char vType = 'S';
				int value = 23000;
				double commRate;
				String veHicleString, commString;
				int veHicle;
				veHicleString = JOptionPane.showInputDialog(null, "Enter a value of your vehicle", JOptionPane.INFORMATION_MESSAGE);
				veHicle = Integer.parseInt(veHicleString);
				commString = JOptionPane.showInputDialog(null, "Enter a value of your vehicle", JOptionPane.INFORMATION_MESSAGE);
				commRate = Integer.parseInt(commString);
				computeCommission(value, commRate, vType);
				computeCommission(40000, 0.10, 'L');
				
			}
			public static void computeCommission(int value, double rate, char vehicle)
			{
				double commission;
				commission = value * rate;
				System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);
				System.out.println("With " + (rate * 100) + "% commission rate, the commission is $" + commission);
			}
	}

