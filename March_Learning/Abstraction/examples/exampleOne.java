abstract class Vehicle {
    abstract void start(); // abstract method
    void fueltype() {
        System.out.println("Use fuel");
    }
}

class Car extends Vehicle {
    void start(){
        System.out.println("Car starts with key");
    }
}

public class exampleOne {
    public static void main(String[] args){
        Car c = new Car();
        c.start();
        c.fueltype();
    }
}
