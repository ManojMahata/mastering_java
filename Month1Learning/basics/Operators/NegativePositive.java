// Problem 4: Positive, Negative, or Zero

// Given an integer num:

// Print "Positive" if num > 0

// Print "Negative" if num < 0

// Print "Zero" if num == 0

import java.util.*;

public class NegativePositive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = scan.nextInt();

        // String result =  (number > 0) ? "Positive" : ((number < 0 ) ? "Negative" : "Zero" );

        String result = ( number < 0 ) ? "Negative" : ( ( number > 0) ? "Positive" : "Zero" );

        System.out.println("The entered number is : " + result);



        scan.close();
    }
}