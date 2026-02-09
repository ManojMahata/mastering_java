// nested if in conditional statement

// here nested if is decision inside decision.

import java.util.*;

public class nestedif {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Program to check voting eligibility.");
        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        System.out.print("Are you a citizing? If you are then type : true, else type : false.  type : ");
        boolean areYou = scan.nextBoolean();

        if (age >= 18) {
            if(areYou){
                System.out.println("Yes, you can vote.");
            }
        } else {
            System.out.println("No you can't vote.");
        }





        scan.close();
    }
}