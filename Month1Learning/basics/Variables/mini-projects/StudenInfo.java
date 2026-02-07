// student info system 

import java.util.*;

public class StudenInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* input to take form user
        name, age, and marks.
        */
        String name;
        int age;
        float marks;
        
        System.out.print("Enter your name : ");
        name = scan.nextLine();
        System.out.print("Enter your age : ");
        age = scan.nextInt();
        System.out.print("Enter your marks : ");
        marks = scan.nextFloat();

        /*Output
        Student details
        Pass / Fail

        Concepts used:
        Variables
        Data types
        Assignment
        Relational + ternary operators */

        String result = ( ( marks >=40 ) ? "Pass" : "Fail" );
        System.out.println("You are " + name + ", and you are " + age + " year old." + " About your result you : " + result);

        scan.close();
    }
}