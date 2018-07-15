package LECTURE.Lecture3;

import java.util.Scanner;

//Write a program that can calculate the most efficient breakdown of any amount of money into these units. Use .printf for output.

public class Money {
	/**Main Method*/
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//get withdrawl amount
		System.out.print("How much money you tryna withdrawl: ");
		double money = input.nextDouble();
		
		//compute bills
		int hundreds = (int) (money / 100);
		money = money % 100;
		int twenties = (int) (money / 20);
		money = money % 20;
		int tens = (int) (money / 10);
		money = money % 10; 
		int fives = (int) (money / 5);
		money = money % 5;
		int ones = (int) (money / 1);
		money = money % 1;
		
		//Print Bills line whatch out for twentIES
		if ((twenties > 1) || (twenties ==0))
			System.out.printf("Bills: you are given %d hundred(s), %d twenties, %d ten(s), %d five(s), %d one(s).\n", hundreds, twenties, tens, fives, ones);
		else
			System.out.printf("Bills: you are given %d hundred(s), 1 twenty, %d ten(s), %d five(s), %d one(s).\n", hundreds, tens, fives, ones);

		//compute coins
		int quarters = (int) (money / .25); money %= .25;
		int dimes = (int) (money / .10); money %= .10;
		int nickles = (int) (money / .05); money %= .05;
		int pennies = (int) (money / .01); 
		
		//Print Coins watch out for penny(IES)
		if ((pennies > 1) || (pennies == 0))
			System.out.printf("Coins: you are given %d quarters, %d dimes, %d nickel(s), %d pennies.", quarters, dimes, nickles, pennies);
		else
			System.out.printf("Coins: you are given %d quarters, %d dimes, %d nickel(s), 1 penny.", quarters, dimes, nickles);
	}

}
