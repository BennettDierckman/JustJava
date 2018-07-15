package LECTURE.Lecture4;

import java.util.Scanner;

//Capitalization should be ignored when comparing ‘opposite’ characters, and spaces / punctuation characters should be ignored entirely.
public class PALINDROMEpt2 {
	/**Main Method*/
	public static void main(String[] args) {
		//Scanner Object
		Scanner input = new Scanner(System.in);
		
		//get user input 
		System.out.println("Please enter a string: ");
		String userInput = input.nextLine();
		
		//assumeTrue
		boolean palindrome = true;
		
		//build reduced string of letters
		String reduced = "";
		for ( int i = 0;  i < userInput.length(); i++)
			if(Character.isLetter(userInput.charAt(i)))
				reduced += userInput.charAt(i);
		
		//if a character and its opposite dont match its not a palindrome
		for ( int i = 0; i < reduced.length(); i++) {
			int opposite = reduced.length() - i - 1;
			if (Character.toUpperCase(reduced.charAt(i)) != Character.toUpperCase(reduced.charAt(opposite)))
				palindrome = false;
		}
		
		System.out.println("The input was a palindrome " + palindrome );
			
	}

}
