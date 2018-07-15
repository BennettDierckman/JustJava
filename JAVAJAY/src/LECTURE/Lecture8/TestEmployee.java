package LECTURE.Lecture8;
//externd the person class to cover a new subclass, Employee.
// employee - String name, String jobTitle, and int salary

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		//with values for the data fields
		Employee emp1 = new Employee("Lucy", "President", 100000);
		System.out.println(emp1);
		Employee emp2 = new Employee("Vincent", "Chief Tech Officer", 70000);
		System.out.println(emp2);
	}
}

class Employee extends Person{
	private String position = "unknown";
	private int salary = 0;
	
	public Employee() {
	}
	
	public Employee(String name, String position, int salary) {
		super(name);
		this.position = position;
		this.salary = salary;
	}
	
	@Override
	public String toString() { 
		return super.getName() + " is the " + position + " and makes " + salary +" a year.";
	}
}