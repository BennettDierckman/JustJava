package LECTURE.Lecture2;

import java.util.Scanner;

public class Cast_And_Round {
	public static void main(String[] args) {
		//Create a new Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a purchase price: $");
		double price = input.nextDouble();
		
		/*$$$$$$$$$$$$$$$ When dealing with MONEY. $$$$$$$$$$$$$$$$$$$$
		 * The sale is 2/3 off!
		 * By int-casting, then multiplying by 100, then dividing by 100.0,
		 * we get a 'normal' dollar price*/
		
		double discountPrice = (int)((price / 3) * 100) / 100.0;
		
		System.out.println("Original Price: $" + price);
		System.out.println("Discount Price (66% off!) : $" + discountPrice);
	}
}
