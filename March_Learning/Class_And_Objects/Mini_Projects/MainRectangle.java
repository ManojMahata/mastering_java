
class retangleClass {
	// attributes
	double length;
	double width;
	double areaOfrectangle;
	// method co calculate length and width
	void calcualteLeghtWidth(){
		areaOfrectangle = length*width;
	}
	void displayInforMethod(){
		System.out.println("Lengt: " + length);
		System.out.println("Width: " + width);
		System.out.println("Therefore Area: " + areaOfrectangle);
	}

}

public class MainRectangle {

	public static void main(String[] args) {
		retangleClass r1 = new retangleClass();

		r1.length = 11;
		r1.width = 10;

		r1.calcualteLeghtWidth();
		r1.displayInforMethod();


	}
}