import java.util.*;
//program to check number is even or odd.
public class evenOdd {

     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number you want to check : ");
        int number = scan.nextInt();

        if (number%2 == 0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number.");
        }



        scan.close();
     }
}