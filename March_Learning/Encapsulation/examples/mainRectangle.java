// class Rectangle

import java.util.Scanner;

class Rectangle {
	// attributes
	// Encapsulation
	private double length, width;

	// setter
	public void Input(double length, double width) {
		// if length or width is 0;
		if (length<=0){
			System.out.println("Invalid input: " + length + " Length cannot be 0 or Negative.");
		} else {
			this.length = length;
		}

		if (width <= 0) {
			System.out.println("Invalid input: " + width + " Width cannot be 0 or less then that.");
		} else {
			this.width = width;
		}
	} // setter close

	// method to calculate area. Area = Length x Width;
	void CalculateAres(){
		double Area = length * width;
		System.out.println("Area of rectangle: " + Area);
	}// method closed;

}// Rectangel class close;

public class mainRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// object to call methods
		Rectangle r1 = new Rectangle();
		System.out.print("Enter the Length of area: ");
		double length = scan.nextInt();
		System.out.print("Enter the Width of area: ");
		double width = scan.nextDouble();
		r1.Input(length, width);
		// calling CalculateArea method
		r1.CalculateAres();
		scan.close();
	}// main method close;
}// main class closed;