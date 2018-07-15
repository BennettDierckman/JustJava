package LECTURE.Lecture8;

public class TestRectangularSolid {
	public static void main(String[] args) {
		RectangularSolid r1 = new RectangularSolid(2, 5, 3);
		System.out.println(r1);
		RectangularSolid r2 = new RectangularSolid(1, 6, 5);
		System.out.println(r2);
	}
}

class RectangularSolid extends Rectangle{
	double depth = 1;	

	RectangularSolid(double length, double width, double depth) {
		super(length, width);
		this.depth = depth;
	}
	
	double getVolume() {
		return getLength() * getWidth() * depth;
	}
	
	@Override
	public String toString() {
		String reply = "This rectangular solid is " + getLength() + " long, " + getWidth() + " units wide, and " + depth + " units deep.";
		return reply;
	}

}