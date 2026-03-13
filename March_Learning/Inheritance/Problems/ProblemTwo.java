class Vehicle{
    String brand;
    // method to show brand output
    void showBrand(){
        System.out.println("Brand: " + brand);
    }
} // Vehicle class closed

class Car extends Vehicle{
    int speed;
    void showSpeed(){
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class ProblemTwo{
    public static void main(String[] args){
    Car c1 = new Car();

    c1.brand = "Noting";
    c1.speed = 123;

    c1.showBrand();
    c1.showSpeed();

    }
}
