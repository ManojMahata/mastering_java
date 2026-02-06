/* 1️⃣ Basic Calculator
Input:
Two numbers: a, b

Operations:
Addition
Subtraction
Multiplication
Division
Modulus

👉 Uses arithmetic operators */

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Basic Calculator (^__^)");
        System.out.println(" Enter number and (addition, subtraction, division, modulas operation will be done.)");

        // double a,s,m,d,mo;

        System.out.println("Enter two numbers one after other.");

        System.out.print("Enter first number please : ");
        double nuM1 = scan.nextDouble();


        System.out.print("Enter second number kid : ");
        double nuM2 = scan.nextDouble();



        System.out.println( "Addition of given numbers is : " + ( nuM1 + nuM2));

        System.out.println("Subtraction of given numbers is : " + (nuM1 - nuM2));

        System.out.println("Multiplication of given number is : " + (nuM1 * nuM2));

        System.out.println("Division of given numbers is : " + (nuM1 / nuM2));

        System.out.println("Modulas result of given numbers is : " + (nuM1%nuM2));

        scan.close();
    }
}