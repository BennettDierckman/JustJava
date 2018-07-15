package LECTURE.Lecture4;

import java.util.Scanner;

//The user is asked to enter a string, then told whether or not it is a palindrome: “a word, phrase, or sequence that reads the same backward as forward”.

public class PALINDROME {
	/**Main Method*/
	public static void main(String[] args) {
		//create a new scanner object
		Scanner input = new Scanner(System.in);
		
		//Get user input 
		System.out.print("Please enter a string or phrase: ");
		String userInput = input.nextLine();
		
		//assume palindrome is true 
		boolean palindrome = true;
		
		for ( int i = 0; i < userInput.length(); i++) {
			//get opposite character using length
			int opposite = userInput.length() - i - 1;
			//if a character and its opposite don't match, no palindrome!
			if(userInput.charAt(i) != userInput.charAt(opposite)) 
				palindrome = false;
		}
		
		System.out.println("The input was a Palindrome: " + palindrome);
	}

}
