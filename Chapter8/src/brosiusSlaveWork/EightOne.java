package brosiusSlaveWork;
public class EightOne {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers = new int[]{23,6,47,35,2,14};
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
                sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("The average number is: " + average);
	}
}
