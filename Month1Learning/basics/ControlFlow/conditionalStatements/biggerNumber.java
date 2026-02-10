
import java.util.*;
// program to check number is positive, negative or zero.

public class biggerNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number you want to check : ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println(number + " is negative number.");
        } else if(number > 0) {
            System.out.println(number + " is positive number.");
        } else {
            System.out.println(number + " is 'Zero'");
        }


        scan.close();
    }
}