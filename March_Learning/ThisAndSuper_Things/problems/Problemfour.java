class Vehicle {
	String type;
	void showType(){
		System.out.println("This is a Vehicle");
	}
}// Vehicle class closed

class Car extends Vehicle{
	void showType(){
		super.showType();
		System.out.println("THis is a Car.");
	}
}

public class Problemfour {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.showType();
	}
}