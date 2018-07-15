package LECTURE.Lecture4;

import java.util.Scanner;

//Write the LoudVowels class. The user specifies a number of words to enter, then we output the words put together into a phrase. 
//All vowels in the words have been capitalized
public class LoudVowels {
	/**Main Method*/
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		String result = "";
		
		//get number of words
		System.out.println("How many words will you enter: ");
		int numWords = input.nextInt();
		
		for (int i = 0; i < numWords; i++){
			System.out.println("Please enter the next word: ");
			String word = input.next();
			for (int j = 0; j < word.length(); j++) {
				if(Character.toUpperCase(word.charAt(j))  == 'A' || Character.toUpperCase(word.charAt(j))  == 'E' || Character.toUpperCase(word.charAt(j))  == 'I' || Character.toUpperCase(word.charAt(j))  == 'O' || Character.toUpperCase(word.charAt(j))  == 'U')
					result += Character.toUpperCase(word.charAt(j));
				else
					result += Character.toLowerCase(word.charAt(j));
			}
			result += " ";
		}
		System.out.println("Here is result: " + result);
	}

}
