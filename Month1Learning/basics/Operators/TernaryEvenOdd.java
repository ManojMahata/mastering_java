import java.util.Scanner;

public class TernaryEvenOdd {

    public static void main(String[] args){

        //variable = (condition) ? expressionIfTrue : expressionIfFalse;


        // Program to check number is eve or odd by using ternary operator.

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.print("Enter the number you want to check : ");
        int number = scan.nextInt();

        String result = ( number %2 == 0 ) ? "Even" : "Odd";

        System.out.println("The given number is " + number + " and it is : " + result + " number.");





        scan.close();

    }
}