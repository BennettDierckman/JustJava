package LECTURE.Lecture4;

import java.util.Scanner;

//The user is asked to enter a series of names and scores (each entry on the same line) until they enter STOP (in any case).

public class HighScore {
	/**Main Method*/
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//Track highest name and score
		String highestName = "Nobody";
		int highestScore = 0;
		
		//get scores from user
		while(true) {
			//get input
			System.out.print("Please enter a score or STOP: ");
			String userIn = input.nextLine();
			
			//check for stop
			if(userIn.equalsIgnoreCase("stop")) 
				break;
			else {
				String[] userArray = userIn.split(" ");
				if (Integer.parseInt(userArray[1]) > highestScore) {
					highestScore = Integer.parseInt(userArray[1]);
					highestName = userArray[0];
				}
			}
		}
		System.out.print("The winner is: " + highestName + " with a score of " + highestScore);
	}

}
