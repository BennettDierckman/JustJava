package LECTURE.Lecture8;

import java.util.Scanner;

public class ExtendsExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//with values for the data fields
		Student first = new Student("Bill", "Senior");
		System.out.println(first.getName() + " is a " + first.getYear());
		System.out.println(first);
		
		//using the no-arg constructor 
		Student second = new Student();
		System.out.println(second.getName() +" is a "+ second.getYear());
		System.out.println(second);
		
		Student third = new Student();
		System.out.print("Please enter a name: ");
		String userInput = input.nextLine();
		third.setName(userInput);
		System.out.println(third);
	}
}

class Student extends Person{
	private String classYear = "Freshman";
	
	public Student() {
	}
	
	public Student(String name, String classYear) {
		super(name); //this.setName(name); // using method from supper class 
		this.classYear = classYear;
	}
	
	public String getYear() {
		return classYear;
	}
	
	public String toString() {
		return super.toString() + "Class Year: " + classYear + "\n";
	}
}
