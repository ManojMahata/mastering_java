interface Shape{
    public void getArea(); // interface doesn't have;
}

class Rectangle implements Shape{
    public void getArea(){
        System.err.println("Rectangle.");
    }
}

class Circle implements Shape{
    public void getArea(){
        System.err.println("Circle.");
    }
}

class Triangle implements Shape{
    public void getArea(){
        System.out.println("Triangle..");
    }
}

public class p1 {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.getArea();

        Circle c = new Circle();
        c.getArea();

        Triangle t = new Triangle();
        t.getArea();
    }
    
}