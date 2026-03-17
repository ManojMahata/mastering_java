class Shape{
    void draw(){

    }
}

class Circle extends Shape{
   void draw(){
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Circle{
   void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Triangle extends Rectangle{
   void draw(){
        System.out.println("Drawing Triangle");
    }
}

public class P2{
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        c.draw();
        r.draw();
        t.draw();
    }
}


