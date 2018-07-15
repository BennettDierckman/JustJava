package LECTURE.Lecture9;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		// Declare arrayList to hava a single element type
		ArrayList<String> userList = new ArrayList<>();
		
		//Change element in array list
		if (userList.contains("Bob")) {
			int bobIndex = userList.indexOf("Bob");
			System.out.println("Bob was present in the list at position: " + bobIndex);
			userList.set(bobIndex, "Robert"); //changes bob to robert
		}
		
		//remove from array list
		if(userList.contains("Danille")) {
			boolean removed = userList.remove("Danielle");
			if (removed)
				System.out.println("Danielle was removed from the list.");
		}

	}
}
