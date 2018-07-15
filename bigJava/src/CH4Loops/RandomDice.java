package CH4Loops;

public class RandomDice {
// tosses a pair of dice ten times
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			//Generate two random numbers between 1 and 6
			int d1 = (int) (Math.random() *6 ) + 1;
			int d2 = (int) (Math.random() * 6 ) + 1;
			System.out.println(d1 + " " + d2);
		}
		System.out.println();
	}

}
