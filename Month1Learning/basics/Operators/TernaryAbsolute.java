// Absolute Value: If x is less than 0, multiply it by -1 to get the absolute value; otherwise, keep x as is.

import java.util.*;

public class TernaryAbsolute {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = scan.nextInt();

        System.out.println("Entered value : " + number );


        int result = ( (number < 0) ? (number * -1) : (number) );

        System.out.println( "Let's check value now : " + result);


        scan.close(); 

        


    }
    
}
