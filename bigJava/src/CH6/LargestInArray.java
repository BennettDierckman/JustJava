package CH6;
/**This program reads a sequence of values and prints them, marking the largst value*/
import java.util.Scanner;

public class LargestInArray {
	/**Main Method*/
	public static void main(String[] args) {
		final int LENGTH = 100;
		double[] values = new double[LENGTH];
		int currentSize = 0;
		
		//read inputs
		System.out.println("Please enter values, Q to quit: ");
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble() && currentSize < values.length) {
			values[currentSize] = in.nextDouble();
			currentSize++;
		}
		
		//find the largest value
		double largest = values[0];
		for (int i = 1; i < currentSize; i++) {
			if (values[i] > largest)
				largest = values[i];
		}
		
		//print all values marking the largest
		for(int i = 0; i < currentSize; i++) {
			System.out.print(values[i]);
			if(values[i] == largest) 
				System.out.print(" <--- LARGEST VALUE");
			System.out.println();
		}
	}

}
