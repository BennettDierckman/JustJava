package LECTURE.Lecture2;

import java.util.Scanner;

//allows you to quickly calculate common tip percentages:

public class Tipping {
	/**MAIN METHOD*/
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		//get price of meal
		System.out.print("Please enter the price of your meal: $");
		double cost = input.nextDouble();
		
		//Calculate common tipping percentages
		double fifteenTip = (int)((cost * .15) * 100) / 100.0;
		double eighteenTip = (int)((cost * .18) * 100) / 100.0;
		double twentyTip = (int)((cost * .2) * 100) / 100.0;
		
		//display results
		System.out.println("The origional price of the meal was $" + cost);
		System.out.println("----------------------------------------------");
		System.out.println("With a 15% tip ($" + fifteenTip + ") : $" + (cost + fifteenTip));
		System.out.println("With a 18% tip ($" + eighteenTip + ") : $" + (cost + eighteenTip));
		System.out.print("With a 20% tip ($" + twentyTip + ") : $" + (cost + twentyTip));

		
	}

}
