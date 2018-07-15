package CH4Loops;

import java.util.Scanner;

public class SentielDemo {

	public static void main(String[] args) {
		double sum = 0;
		int count = 0;
		double salary = 0;
		System.out.println("Enter Salaries, -1 to finish");
		Scanner in = new Scanner(System.in);
		
		//precess data until the sentinel is entered;
		while (salary != 1) {
			salary = in.nextDouble();
			if (salary != -1) {
				sum = sum + salary;
				count++;
			}
		}
		
		//compute and print the average
		if (count > 0) {
			double average = sum /count;
			System.out.println("Average Salary: " + average);
		}
		else
			System.out.println("No Data");
	}

}
