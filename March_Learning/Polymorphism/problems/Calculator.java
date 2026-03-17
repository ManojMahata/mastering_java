class Cal {
	// method overload
	int multiply(int a, int b){
		return a * b;
	}

	int multiply(int a, int b, int c){
		return a * b * c;
	}

	double multiply(double a, double b){
		return  a * b;
	}
}

// main class
public class Calculator {

	public static void main(String[] args) {
		Cal c1 = new Cal();
		System.out.println(c1.multiply(5, 5));
		System.out.println(c1.multiply(5.5, 5.5));
		System.out.println(c1.multiply(5,5,5));

	}
}