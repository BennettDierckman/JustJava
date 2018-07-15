package LECTURE.Lecture3;
//DEMONSTRATES MATH RANDOM NUMBERS
public class MathRandom {
	/**Main Method*/
	public static void main(String[] args) {
		
		//this gives us a random number between 1 and 6
		int randomDie = (int) (Math.random() * 6) + 1;
		System.out.println("The random die roll is: " + randomDie);
		
		//This gives us a random double between 50 and 75
		//this range includes 50, but NOT 75
		double randomDouble = 50 + Math.random() * 25;
		System.out.println("The random double is: " + randomDouble);
	}

}
