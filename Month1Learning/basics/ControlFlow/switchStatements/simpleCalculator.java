import java.util.Scanner;

public class simpleCalculator {

    public static void main(String[] args) {
        // Simple calculator usign switch statement.
        Scanner scan = new Scanner(System.in);

        double numberOne, numberTwo; 
        int operation;

        System.out.print("Enter first number : ");
        numberOne = scan.nextDouble();
        System.out.print("Enter second number : ");
        numberTwo = scan.nextDouble();

        System.out.println("Enter : 1 for addition (+)");
        System.out.println("Enter : 2 for subtraction (-)");
        System.out.println("Enter : 3 for multiplication (*)");
        System.out.println("Enter : 4 for division (/)");

        double addition = numberOne + numberTwo;
        double subtraction = numberOne - numberTwo;
        double multiplication = numberOne * numberTwo;
        double division = numberOne / numberTwo; 

        System.out.print("Enter number from 1 to 4 according to operation you want to perform. ");
        operation = scan.nextInt();

        switch (operation) {

        case 1:
            System.out.println("Addition of " + numberOne + " and " + numberTwo + " is : " + addition);
            break;

        case 2:
            System.out.println("Subtraction of " + numberOne + " and " + numberTwo + " is : " + subtraction);
            break;

        case 3:
            System.out.println("Multiplication of " + numberOne + " and " + numberTwo + " is : " + multiplication);
            break;

        case 4:
            System.out.println("Division of " + numberOne + " and " + numberTwo + " is : " + division);
            break;

        default : 
            System.out.println(operation + " operation is not possible. ");
            break;
        }


        scan.close();
    }
}