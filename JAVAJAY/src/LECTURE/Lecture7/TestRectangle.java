package LECTURE.Lecture7;

import java.util.Scanner;

public class TestRectangle {
	/**Main Method*/
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//get length and width
		System.out.print("Please enter the length of your rectangle : ");
		double length = Double.parseDouble(input.nextLine());
		System.out.print("Please enter the width of you double : ");
		double width = Double.parseDouble(input.nextLine());
		
		//create rectangle
		Rectangle rec1 = new Rectangle(length, width);
		
		//display area and perimeter 
		System.out.printf("The area of your rectangle is: %4.2f cubic cm", rec1.getArea());
		System.out.printf("\nThe perimeter of your rectangle is: %4.2f cubic cm", rec1.getPerimeter());
	}
}

class Rectangle{
	//these are the data fields for the rectangle
	double length = 1;
	double width = 1;
	
	//Empty constructor, (uses default values)
	Rectangle(){
	}
	
	//Constructor that accepts length and width
	Rectangle (double length, double width){
		this.length = length;
		this.width = width;
	}
	
	double getArea() {
		return length * width;
	}
	double getPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	//These void methods are 'setters'
	void setLength(double newLength) {
		this.length = newLength;
	}
	void setWidth(double newWidth) {
		this.width = newWidth;
	}
}