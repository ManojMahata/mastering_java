// we use if else if condition when more then two decision exist.

// program to check grade of student.

import java.util.*;
public class ifelseif {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        short marks = scan.nextShort();

        if (marks >100) {
            System.out.println("Invalid marks.");
        } else if ( marks >= 90 && marks < 100) {
            System.out.println("Your gread 'A' .");
        } else if ( marks < 90 && marks >= 75) {
            System.out.println("Your grade is : B");
        } else if( marks <75 && marks >= 60) {
            System.out.println("Your grade is : C");
        } else if( marks < 60 && marks >= 40 ) {
            System.out.println("You got : D as a your grade.");
        } else {
            System.out.println("Fail nigga.");
        }


        scan.close();
    }
}