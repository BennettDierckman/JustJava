package CH4Loops;
//computes time required to double an investment
public class DoubleInvestment {

	public static void main(String[] args) {
		final double RATE = 5; 
		final double INITIAL_BALANCE = 10000;
		final double TARGET = 2 * INITIAL_BALANCE;
		
		double balance = INITIAL_BALANCE;
		int year = 0;
		
		//count years required for the investment to double
		while(balance < TARGET) {
			year++;
			double interest = balance * RATE/100;
			balance = balance + interest;
		}
		
		System.out.println("The investment will double after: " + year + " years." );
	}

}
