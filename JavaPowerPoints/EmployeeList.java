import java.util.ArrayList;

public class EmployeeList {
	public static void main(String[] args) {		
		
			
	}
}

class Employee extends Person{
	private String jobTitle = "Unknown";
	private int salary = 0;
	
	// No-arg constructor
	public Employee() {
	}
	
	public Employee(String name, String jobTitle, int salary) {
		super(name); // invokes the superclass constructor
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	// new access method goes here!
	
	@Override
	public String toString() {
		return this.getName() + " is the " + jobTitle + " and makes $" + salary + " a year.\n";
	}
}

/*// IF YOU ALREADY HAVE THE PERSON CLASS IN YOUR WORKSPACE
// YOU CAN DELETE THIS. OTHERWISE YOU'LL GET AN ERROR:
// 'The type Person is already defined.'
class Person {
	private String name = "Default Name";
	java.util.Date altered = new java.util.Date();
	
	// No-arg Constructor
	public Person () {
		altered = new java.util.Date();
	}
	
	public Person (String name){
		altered = new java.util.Date();
		this.name = name;
	}
	
	// Getter method
	public String getName() {
		return name;
	}
	
	// Setter method
	public void setName(String newName) {
		if (!newName.equals("")) {
			name = newName;
			altered = new java.util.Date();
		}
		else
			System.out.println("Can't change name. Empty names aren't allowed!");
	}
	
	public String toString() {
		return "Name: " + name + "\nLast Altered: " + altered.toString() + "\n";
	}
}*/
