package exercises;
import javax.swing.JOptionPane;
class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
        int b;

        int numbers;
        int length = Integer.parseInt(JOptionPane.showInputDialog (null, "Input set size", JOptionPane.QUESTION_MESSAGE));
        int ctr = 1;
        int num[] = new int[length];

            for(int i = 0; i < length; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog (null, "Enter number " + ctr, JOptionPane.QUESTION_MESSAGE));
                    ctr++;
            }

            for(int i = 0; i < length; i++){
                for(int j = i+1; j < length; j++){
                        if(num[i]<num[j]){
                            a = num[i];
                            num[i] = num[j];
                            num[j] = a;
                        }
                    }
            }

            for(int i = 0; i < length; i++){
            JOptionPane.showMessageDialog (null, "Output: " + num[i] , "Value", JOptionPane.INFORMATION_MESSAGE);
            }
	}

}
