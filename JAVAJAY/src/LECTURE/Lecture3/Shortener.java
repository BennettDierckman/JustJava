package LECTURE.Lecture3;

import java.util.Scanner;

//National Novel Writing Month is a project affectionately known to participants as “NaNoWriMo”. 
//Write a program that uses String slicing to convert any four words into a similar “shorter” version using a 2-2-3-2 pattern:

public class Shortener {
	/**Main Method*/
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//get 4 words from user
		System.out.print("Please enter the first word: ");
		String w1 = input.next().substring(0, 2);  // use substring to get first two letters
		System.out.print("Please enter the second word: ");
		String w2 = input.next().substring(0, 2);
		System.out.print("Please enter the third word: ");
		String w3 = input.next().substring(0, 2);
		System.out.print("Please enter the fourth word: ");
		String w4 = input.next().substring(0, 2);
		
		//Toss them to gether
		System.out.println("New Version: " + w1 + w2 + w3 + w4);
	}

}
