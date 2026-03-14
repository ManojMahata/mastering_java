class Shape {
    void displayShape(){
        System.out.println("This is a shape");
    }
}
// Shape class closed || Parent class

class Rectangle extends Shape{
    protected double length;
    protected double breadth;

    void calculateArea(){
        double area = length * breadth;
        System.out.println("Rectangel Area: " + area);
    }
} // Rectangle class closed

class Circle extends Shape{
    protected double radius;
    void calculateArea(){
        double area = 3.14* radius * radius;
        System.out.println("Circle Area: " + area);
    }
} // Circle class closed

public class ShapeSystem{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();

        r1.length = 10;
        r1.breadth = 5;

        c1.radius = 7;

        r1.displayShape();
        r1.calculateArea();

        c1.calculateArea();
        c1.displayShape();
    }
}
