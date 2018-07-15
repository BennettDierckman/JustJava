package LECTURE.Lecture5;

import java.util.Scanner;

//write the greeting method:
//public static void greeting(String name, int age)
//Your program should call the method inside a loop (in main, which is also where you get user input) to output information on three people:

public class GreetingMethod {
	/**Main Method*/
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		int numNames = 3;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Please enter your name: ");
			String name = input.next();
			System.out.print("Please enter your age as an integer: ");
			int age = input.nextInt();
			greeting(name, age);
		}
	}
	
	/**Greeting Method
	 * @param name - string that represents name
	 * @param age - integer that represents name's age
	 * @return Sysout(void) - displaying the name with the age */
	public static void greeting(String name, int age) {
		System.out.println("Welcome, " + name + ". Congrats on being " + age + " years old!");
		System.out.println();
	}
	
	
}
