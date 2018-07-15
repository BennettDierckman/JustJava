package LECTURE.Lecture8;

public class Rectangle{
	//these are the data fields for the rectangle
	private double length = 1;
	private double width = 1;
	
	//Empty constructor, (uses default values)
	Rectangle(){
	}
	
	//Constructor that accepts length and width
	Rectangle (double length, double width){
		this.setLength(length);
		this.setWidth(width);
	}
	
	double getArea() {
		return getLength() * getWidth();
	}
	double getPerimeter() {
		return (getLength() * 2) + (getWidth() * 2);
	}
	
	//These void methods are 'setters'
	void setLength(double newLength) {
		this.length = newLength;
	}
	void setWidth(double newWidth) {
		this.width = newWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
}
