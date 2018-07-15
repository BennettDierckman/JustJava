public class TestEmployee {
	public static void main(String[] args) {		
		// Define some employees
		Employee president  = new Employee("Lucy", "President", 100000);		
		System.out.println(president);	
		

		Employee cto  = new Employee("Vincent", "Chief Tech Officer", 70000);		
		System.out.println(cto);	
	}
}

class Employee extends Person{
	// ADD YOUR CODE HERE!!!
	// Nothing above needs to change.
	
	// You need data fields, a constructor or two, and a to-string method
}

// IF YOU ALREADY HAVE THE PERSON CLASS IN YOUR WORKSPACE
// YOU CAN DELETE THIS. OTHERWISE YOU'LL GET AN ERROR:
// 'The type Person is already defined.'
class Person {
	private String name = "Default Name";
	
	// No-arg Constructor
	public Person () {
	}
	
	public Person (String name){
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
		}
		else
			System.out.println("Can't change name. Empty names aren't allowed!");
	}
	
	public String toString() {
		return "Name: " + name + "\n";
	}
}
