package InputOutput;

import java.util.Scanner;

public class vendingMachine {

	public static void main(String[] args) {
		//simulates a vending machine and the change it gives
		Scanner in = new Scanner(System.in);
		
		final int PENNIES_PER_DOLLAR = 100;
		final int PENNIES_PER_QUARTER = 25;
		System.out.println("Enter a bill value: (1, 5, 10, 20, 50, 100) : ");
		int billValue = in.nextInt();
		System.out.println("Enter item price in pennies: ");
		int itemPrice = in.nextInt();
		
		//compute change due
		int changeDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
		int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
		changeDue = changeDue % PENNIES_PER_DOLLAR;
		int quarters = changeDue / PENNIES_PER_QUARTER;
		
		//print change due
		System.out.printf("Dollar coins: %6d", dollarCoins);
		System.out.println();
		System.out.printf("Quarters:     %6d", quarters);
		System.out.println();
	}

}
