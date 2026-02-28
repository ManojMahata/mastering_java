// defined the class as a Car.
class Car {
// attributes (what a car has?)
	String brand;
	String color;
	int speed;

	// method ( what car actually does?)
	void accelerate() {
		speed += 10;
		System.out.println(brand + " is now going " + speed + " km/h");
	}

	void displayInfo(){
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Speed: " + speed);
	}
}

// main class to run the program
public class feb{
	public static void main(String[] args) {

		// Creating Objects (instance of Car)
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.color = "Red";
		car1.speed = 0;

		Car car2 = new Car();
		car2.brand = "Honda";
		car2.color = "Blue";
		car2.speed = 0;

		// using the objects;

		car1.displayInfo();
		car1.accelerate();
		car1.accelerate();

		System.out.println("---");

		car2.displayInfo();
		car2.accelerate();

/*
			Car car1 = new Car();
			Car car2 = car1;
			car2.brand = "BMW";
			System.out.println(car1.brand); // What prints here?

			prints error because we already created car1 and car2 earlier in this method
			we can't create them again with same names;

			Car car1 = new Car();
			Car car2 = new Car();

	Car car1 = new Car();   // ❌ second declaration
			Car car2 = car1; // ❌ second declaration


*/

		// fixed varsion...
		car2 = car1;
		car2.brand = "BMW";
		car2.color = "pink";
		System.out.println(car1.brand + " " + car1.color);


	}
}