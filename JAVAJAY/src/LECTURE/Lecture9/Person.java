package LECTURE.Lecture9;

public class Person {
	private String name = "Default Name";
	java.util.Date altered = new java.util.Date(); // date modified
	
	//no arguments constructor
	public Person() {
		altered = new java.util.Date();
	}
	
	public Person(String name) {
		altered = new java.util.Date();
		this.name = name;
	}
	
	//getter method
	public String getName() {
		return name;
	}
	
	//setter method
	public void setName(String newName) {
		if(!newName.equals(" ")) {
			this.name = newName;
			altered = new java.util.Date();
		}
		else
			System.out.println("Can't change name. Empty names aren't allowed!");
	}
	
	public String toString() {
		return "Name: " + name + "\nLast Altered: " + altered.toString() + "\n";
	}
}
