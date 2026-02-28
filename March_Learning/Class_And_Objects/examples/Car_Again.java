class Carr {
	// attributes
	String brand;
	double price;

	// method
	void showDetails(){
		System.out.println("Car brand: " + brand);
		System.out.println("Price: " + price);
	}
}

public class Car_Again {

	public static void main(String[] args) {
		Carr c1 = new Carr();// object one
		c1.brand = "Honda";
		c1.price = 10000;

		Carr c2 = new Carr();// object two.
		c2.price = 31111;
		c2.brand = "Tesla";

		c2.showDetails();
		c1.showDetails();
	}
}