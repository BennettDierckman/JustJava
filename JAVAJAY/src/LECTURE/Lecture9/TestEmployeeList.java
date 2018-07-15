package LECTURE.Lecture9;

import java.util.ArrayList;

public class TestEmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> Employees = new ArrayList<>();
		
		Employees.add(new Employee("Lucy", "President", 100000));
		Employees.add(new Employee("Vincent", "Chief Tech Officer", 70000));
		Employees.add(new Employee("Alejandra", "CFO", 65000));
		Employees.add(new Employee("Stephan", "CRO", 60000));
		Employees.add(new Employee("Isabella", "CEO", 120000));
		
		int total = 0;
		System.out.println("The current employees are: ");
		for (Employee e : Employees) {
			total += e.getSalary();
			System.out.println("\t" + e);
		}
		System.out.println("\nThe company spends a total of $" + total + " on salaries each year");
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
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() { 
		return super.getName() + " is the " + position + " and makes " + salary +" a year.";
	}
}
