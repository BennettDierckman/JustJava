package LECTURE.Lecture3;

import java.util.Scanner;

//user is asked to wager on which of two game players wins (gets the largest number) – Player1, 
//who rolls 2 six-sided dice and adds them together, or Player2, who rolls 2 ten-sided dice and takes the larger value between them
public class Odds {

	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		// get user's bet
		System.out.print("Please bet on Player1 (sum of two 6 sided die rols), or Player2(larger of two, tensided die rolls) : ");
		String userGuess = input.next();
		
		//figure out Player1
		int player1 = (int) ((Math.random() * 12) + 1);
		
		//figure out Player2
		int p2r1 = (int) (Math.random() * 10) + 1;
		int p2r2 = (int) (Math.random() * 10) + 1;
//		if (p2r1 > p2r2)
//			player2 = p2r1;
//		else
//			player2 = p2r2;
		int player2 = Math.max(p2r1, p2r2);
		
		//figure out winner
		if (player1 > player2) {
			System.out.println("The results are: Player1 - " + player1 + ", Player2 - " + player2);
			if (userGuess.equalsIgnoreCase("Player1"))
				System.out.println("You Win!!");
			else
				System.out.println("You LooooSe!");
		}
		else if(player2 > player1) {
			System.out.println("The results are: Player1 - " + player1 + ", Player2 - " + player2);
			if (userGuess.equalsIgnoreCase("Player2"))
				System.out.println("You Win!!");
			else
				System.out.println("You LooooSe!");
		}
		else
			System.out.println("You Loose");
	}
}
