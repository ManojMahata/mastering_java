import java.util.Scanner;

abstract class Shape{
    abstract double calculateArea();
    abstract double claculatePerimeter();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    //@Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }

    double claculatePerimeter(){
        return 2 * Math.PI * radius;
    }

}


class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double a, double b, double c){
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    double calculateArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s - side3));
    }

    double claculatePerimeter(){
        return side1+side2+side3;
    }
}



public class p2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the redius of the circle: ");
        double r = scan.nextDouble();
        Shape c = new Circle(r);
        System.out.println("Radius of the Circle: " + r);
        System.out.println( "Area of the Circle: " + c.calculateArea());
        System.out.println( "Perimeter of the circle: " + c.claculatePerimeter());

        double side1, side2, side3;
        System.out.print("Enter lenght of Triangle side. \nSide1 = ");
        side1 = scan.nextDouble();

        System.out.print("Side2 = ");
        side2 = scan.nextDouble();

        System.out.print("Side3 = ");
        side3 = scan.nextDouble();

        Shape t = new Triangle(side1,side2,side3);
        System.out.println("Area of the Triangle : " + t.calculateArea());
        System.out.println( "Perimeter of the Triangle: " + t.claculatePerimeter());

        scan.close();

    }
}
