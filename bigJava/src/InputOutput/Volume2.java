package InputOutput;

import java.util.Scanner;

public class Volume2 {

	public static void main(String[] args) {
		//get price per six pack
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Price Per Six Pack: ");
		double packPrice = in.nextDouble();
		
		//get volume of the can
		System.out.println("What is the volume of each can (in ounces): ");
		double canVolume = in.nextDouble();
		
		//compute pack volume
		final double CANS_PER_PACK = 6;
		double packVolume = canVolume * CANS_PER_PACK;
		
		//compute and print price per pack
		double pricePerOunce = packPrice / packVolume;
		
		System.out.printf("Price per ounce: %8.2f", pricePerOunce);
		System.out.println();
		
	}

}
