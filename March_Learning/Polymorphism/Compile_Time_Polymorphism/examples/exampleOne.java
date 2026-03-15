// Compile time polymorphism is known as method overloading. This happens when multiple method have same method name
// but different parameters.

class Calculator {
    int add (int a, int b){
        return a+b;
    }

    int add (int a, int b, int c) {
        return a+b+c;
    }

    double add(double a, double b){
        return a + b;
    }

}// Calculator class closed

public class exampleOne{
    public static void main(String[] args){

        Calculator c = new Calculator();

        System.out.println(c.add(2,3,4));
        System.out.println(c.add(2,3));
        System.out.println(c.add(2.4,2.2));
    }
}

