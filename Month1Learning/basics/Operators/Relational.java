// About relational operator
// What are relational operator for?
// Ans: relational operators are used to check for relations like equality, greater then, and less then. They return boolean result after comparision.

import java.util.*;

public class Relational {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // lets compare value after getting input from user;

        int a = 10, b = 5;

        System.out.println(" a > b ? Let's see: " + (a > b));
        System.out.println(" a < b ? lte's see: " + ( a < b));
        System.out.println(" a >= b ? let's see: " + ( a >= b));
        System.out.println(" a <= b ? lets see : " + ( a <= b));
        System.out.println(" a == b ? answer: " + ( a == b));

        System.out.println(" a != b ? answer: " + ( a != b));

        


        scan.close();
    }
}