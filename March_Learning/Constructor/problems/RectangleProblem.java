class RectangleClass {
	// created class Rectangle
	// initialize attributes
	double length;
	double width;
	double area;

	// constructor to get value while we create object
	RectangleClass( double n, double w){
		length = n;
		width = w;
	}

	// method to calculate the are
	void calculateTheAreaMethod(){
		area = length * width;
	}

	void displayInfo(){
		System.out.println("Length entered by user: " + length);
		System.out.println("Width enterd by user: " + width);
		System.out.println("Therefore area: " + area);
	}
}

public class RectangleProblem {

	public static void main(String[] args) {
		RectangleClass r1 = new RectangleClass(10, 10);
		r1.calculateTheAreaMethod();
		r1.displayInfo();
	}
}