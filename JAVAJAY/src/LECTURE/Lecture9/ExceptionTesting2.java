package LECTURE.Lecture9;

import java.util.Scanner;

public class ExceptionTesting2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a phrase: ");
		String phrase = input.nextLine();
		
		//get three index numbers
		System.out.print("Please enter 3 index numbers");
		int[] numbers = {input.nextInt(), input.nextInt(), input.nextInt()};
		
		try {
			System.out.println("Your selection is: " + selectedProportion(phrase, numbers));
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	private static String selectedProportion(String phrase, int[] selections) {
		String portion = "";
		
		for (int i = 0; i < selections.length; i++) {
			portion += phrase.charAt(selections[i]);
		}
		
		return portion;
	}
}
