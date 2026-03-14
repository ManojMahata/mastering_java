// parent class || Rectangle
class Rectangle{
    // Attributes
    protected double length;
    protected double breadth;

    Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }

    protected double area;

    void calculateArea(){
         area = length * breadth;
    }// calculateArea method closed

    void display(){
        this.calculateArea();
        System.out.println("Lenght: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area : " + area);
    }// display method closed

}// Rectangel class closed

public class ProblemTwo{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(7, 7); // method to call Rectangle class;
        r1.display();
    }// main method closed
}// main class closed


