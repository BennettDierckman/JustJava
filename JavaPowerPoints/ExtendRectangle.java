// Your code goes at the BOTTOM OF THIS FILE.
// Look for an empty class.

public class ExtendRectangle {

	public static void main(String[] args) {
		
		RectangularSolid box1 = new RectangularSolid(2, 5, 3);
		System.out.println(box1);
		
		RectangularSolid box2 = new RectangularSolid(1, 6, 5);
		System.out.println(box2);
		
		System.out.println("Are these these equal? " + box1.equals(box2));
	}
}

class Rectangle {
	// We only need one copy of this - static!
	static int count = 0;
	
	// length and width change every time - instance!
	double length = 1;
	double width = 1;
	
	// This constructor accepts a length and width
	Rectangle (double length, double width){
		this.length = length;
		this.width = width;
		count++;	// increment the rectangle count
	}
	
	double getArea() {
		return length * width;
	}
	
	double getPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	// These void methods are 'setters'
	void setLength(double newLength) {
		this.length = newLength;
	}
	
	void setWidth(double newWidth) {
		this.width = newWidth;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Rectangle)
			return (length == ((Rectangle)o).length && width == ((Rectangle)o).width);
		else
			return false;
	}
	
	public String toString() {
		String reply = "This rectangle is " + length + " units long and " + width + " units wide.";
		
		return reply;
	}
	
}

class RectangularSolid extends Rectangle {
	// Your code goes here
	
}
