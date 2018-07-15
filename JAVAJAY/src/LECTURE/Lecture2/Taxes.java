package LECTURE.Lecture2;

import java.util.Scanner;

//compute the tax owed on a quarterly salary made up of three amounts entered on the same line
public class Taxes {
	/**MAIN METHOD*/
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Get salary amounts
		System.out.print("Please enter your salary amounts for the next quarter (Three months) : ");
		double m1 = input.nextDouble();
		double m2 = input.nextDouble();
		double m3 = input.nextDouble();
		double totalIncome = m1 + m2 + m3;
		
		//get the tax rate as a percentage 
		System.out.print("Please enter the taxrate as a percent : ");
		double taxRate = input.nextDouble() / 100;
		
		//print out quartly income
		System.out.println("Your income for the quarter is : $" + totalIncome);
		
		//compute tax
		double tax = (int)((taxRate * totalIncome) * 100) / 100.0;
		
		//display what they owe in taxes
		System.out.println("You owe $" + tax + " for a " + taxRate + "% tax." );
		
		
	}

}
