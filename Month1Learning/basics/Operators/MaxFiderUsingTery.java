import java.util.*;

public class MaxFiderUsingTery {

    public static void main(String[] args) {

        // The "Max" Finder: Create a method that takes two integers, a and b, and returns the larger one using a ternary operator.
        Scanner scan = new Scanner(System.in);

        double a, b;
        System.out.println("Enter two numbers.");

        System.out.print("This is number a :  ");
        a = scan.nextDouble();

        System.out.print("This is number b : ");
        b = scan.nextDouble();

        double result = ( ( a > b ) ? a : b );

        System.out.println(" Greater number is : " + result);


        scan.close();

    }   
}

