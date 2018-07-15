package InputValiation;

import java.util.Scanner;

//simulates elevator pannel that skips the 13th floor, checks for input errors
public class ElevatorSimulation2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Floor: ");
		if (in.hasNextInt()) {
			//user has entered an integer
			int floor = in.nextInt();
			if(floor == 13)
				System.out.println("There is no 13th floor...");
			else if (floor <=0 || floor > 20)
				System.out.println("Error: Floor must be between 1 and 20");
			else {
				//input is legit
				int actualFloor = floor;
				if (floor > 13)
					actualFloor = floor - 1;
				System.out.println("The elevator will travel to the actual floor " + actualFloor);
			}
		}
		else
			System.out.println("Error: not an Integer.");
	}

}
