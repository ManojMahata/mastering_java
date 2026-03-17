class Vehicle{
    void start(){
        System.out.println("This is vehicle");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("This is bile");
    }
}

class Bus extends Vehicle{
    void start(){
        System.out.println("This is bus");
    }
}

public class Pthree{
    public static void main(String[] args){
        Car c = new Car();
        Bike b = new Bike();
        Bus bs = new Bus();

        c.start();
        b.start();
        bs.start();
    }
}
