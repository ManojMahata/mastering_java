// conditional statements

// if-else statement

// ask yourself quesstion at the end of progra.

import java.util.*;
public class ifElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // if age is >= 18 print adult else print minor
        System.out.print("Enter your age paul : ");
        int age = scan.nextInt();

        if ( age >= 18 ) {
            System.out.println(age + " years old means you are adult now.");
        } else {
            System.out.println(age + " years old means you are still minor.");
        }

        scan.close();
    }
}