class discountClass {
	// attributes
	String brand;
	double price;
	double discount = 0;

	// methods
	void discountOnLaptopMethod(){

		if (price <= 0) {
			System.out.println("Invalid price: " + price);
		} else if (price <= 100000){
			discount = (price/100) * 10;
		} else if(price <= 300000){
			discount = (price/100) * 13;
		} else if ( price > 300000) {
			discount = (price/100) * 15;
		}
	}

	void displaInfoMethod(){
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
		System.out.println("Discount: " + discount);
	}

}

public class LaptopDiscount {

	public static void main(String[] args) {
		discountClass d1 = new discountClass();
		d1.brand = "Honda";
		d1.price = 900000;

		d1.discountOnLaptopMethod();
		d1.displaInfoMethod();
	}
}