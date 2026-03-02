class DiscountClass{
	// attributes
	String brand;
	double price;

	// constructor
	DiscountClass(String n, double p){
		brand = n;
		price = p;
	}

	// method to apply discount
	void disocuntOnLaptop(){
		if(price <= 0){
			System.out.println("No discount!! Invalid price entered by user!!" + price);
		} else if (price <= 100000){
			double discount = (price/100) * 8;
			System.out.println("Brand Name: " + brand);
			System.out.println("Price: " + price);
			System.out.println("Discount: " + discount);
			System.out.println("Final price after discount: " + (price - discount));
		} else if(price <= 200000){
			double discount = (price/100) * 10;
			System.out.println("Brand Name: " + brand);
			System.out.println("Price: " + price);
			System.out.println("Discount: " + discount);
			System.out.println("Final price after discount: " + (price - discount));
		} else if( price > 200000){
			double discount = (price/100) * 12;
			System.out.println("Brand Name: " + brand);
			System.out.println("Price: " + price);
			System.out.println("Discount: " + discount);
			System.out.println("Final price after discount: " + (price - discount));
		}
	}

}

public class LaptopMain {

	public static void main(String[] args) {
		DiscountClass d1 = new DiscountClass("Lenovo V14", 120000);
		d1.disocuntOnLaptop();
		DiscountClass d2 = new DiscountClass("Lenovo V15", 1000000);
		d2.disocuntOnLaptop();
	}
}