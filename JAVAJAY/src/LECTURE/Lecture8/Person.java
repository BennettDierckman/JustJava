package LECTURE.Lecture8;

public class Person {
		private String name = "Default Name";
		
		//no arguments constructor
		public Person() {
		}
		
		public Person(String name) {
			this.name = name;
		}
		
		//getter method
		public String getName() {
			return name;
		}
		
		//setter method
		public void setName(String newName) {
			if(!newName.equals(" "))
				this.name = newName;
			else
				System.out.println("Can't change name. Empty names aren't allowed!");
		}
		
		public String toString() {
			return "Name: " + name + "\n"; 
		}
}
