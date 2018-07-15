package Strings;

import java.util.Scanner;

public class Substrings_Initials {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Get names of the couple 
		System.out.print("Enter your first name: ");
		String first = in.next();
		System.out.print("Enter your Significant other's first name: ");
		String second = in.next();
		
		//compute and display the information
		String initials = first.substring(0, 1) + "&" + second.substring(0,1);
		System.out.println(initials);
	}

}
