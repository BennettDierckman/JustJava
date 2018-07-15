package LECTURE.Lecture2;

import java.util.Scanner;

//calculates the amount of local currency (yen) you will receive for any given amount of dollars and exchange rate
public class CurrencyConversion {
	/**Main Method*/
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//Get the amount of US Dollars
		System.out.print("Please enter the amount of dollars: $");
		double dollars = input.nextDouble();
		
		//get the exchange rate
		System.out.print("Please enter the exchange rate to Japnese yen: ");
		double xRate = input.nextDouble();
		
		//Calculate
		double yen = dollars * xRate;
		
		//display
		System.out.print("You Recieve : " + yen);
		
	}

}
