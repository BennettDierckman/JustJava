package LECTURE.Lecture1;

import java.util.Scanner;

//calculates the total height of all of your group members, in inches (There are 12 inches to a foot). Additionally, 
//convert the total height in inches into feet and inches.

public class TotalHeight {

	public static void main(String[] args) {
		//get input for 3 team members
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first persons height (in inches): ");
		int h1 = input.nextInt();
		System.out.println("Enter seccond persons height (in inches): ");
		int h2 = input.nextInt();
		System.out.println("Enter third persons height (in inches): ");
		int h3 = input.nextInt();
		
		//compute
		int totalInches = h1 + h2 + h3;		
		int feet = totalInches / 12;
		int remainingInches = totalInches % 12;
		
		//display
		System.out.println("The total height in our group is: " + totalInches + " inches.");
		System.out.println("That's " + feet + " feet and "+ remainingInches + " inches." );
	}

}
