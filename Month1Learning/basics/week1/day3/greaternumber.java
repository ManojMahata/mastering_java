
// import scanner library
import java.util.*;

public class greaternumber{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /* to compare two numbers
        we need two variables 
        we will use if else statement*/

        System.out.print("Enter first number: ");
        long num1 = scan.nextLong();
        System.out.print("Enter second number: ");
        long num2 = scan.nextLong();

        if (num1 > num2) {
            System.out.println("Number "+num1+ " is bigger then "+num2);
        }else {
            System.out.println("Number "+num2+ " is bigger then "+num1);
        }

        scan.close();
    }
}