class Car {
	public String brand;
}

public class Public_Modifier {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "Honda";
		System.out.println("Brand: " + c1.brand);

		Car c2 = new Car();
		c2.brand = "Toyota";
		System.out.println("\nBrand: " + c2.brand);
	}
}