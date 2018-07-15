package LECTURE.Lecture5;

import java.util.Scanner;

//write the doubleAverage method, which is value-returning:
//public static double doubleAverage(Scanner input)
//The doubleAverage method allows the user to input doubles until they choose stop, then returns the average.
//Your program should call the method in main. 

public class DoubleAverage {
	/**MAIN METHOD*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//call the method and output the result, rounded to 2 decimal places
		System.out.printf("The average of those values is : %2.2f", doubleAverage(input));
	}
	
	/**doubleAverage Method - user inputs doubles untill they choose STOP - returns average
	 * @param input - Scanner 
	 * @return Sysout(void) - print out the average of all doubles entered*/
	public static double doubleAverage(Scanner input) {
		double total = 0;
		int count = 0;
		
		while(true) {
			System.out.print("Please enter a double or STOP: ");
			String userInput = input.nextLine();
			
			//check for stop
			if(userInput.equalsIgnoreCase("stop"))
				return total / count; // return functions as a break here
			
			//increment count
			count++;
			//Process the next number
			total += Double.parseDouble(userInput);	
		}
	}

}
