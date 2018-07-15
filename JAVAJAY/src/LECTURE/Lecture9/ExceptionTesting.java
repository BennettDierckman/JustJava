package LECTURE.Lecture9;

import java.util.Scanner;

public class ExceptionTesting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int miles = 0; //this must be declared outside of a block
		
		try {
			System.out.print("Please enter a distance (int) in miles: ");
			miles = Integer.parseInt(input.nextLine());
			
		}catch(NumberFormatException ex) {
			System.out.println("You must enter an integer!");
			//System.exit(1); //ends program immediatly
		}finally {
			if(miles == 0) 
				System.out.println("Miles is 0 or no integer was entered.");
			else {
				//convert
				double kilometers = miles * 1.60934;
				
				System.out.println(miles + " miles is: " + kilometers + " km");
			}
		}
		
//		//convert
//		double kilometers = miles * 1.60934;
//		
//		System.out.println(miles + " miles is: " + kilometers + " km");
	}
}
