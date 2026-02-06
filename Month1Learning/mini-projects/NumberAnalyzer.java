import java.util.*;

public class NumberAnalyzer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* 2️⃣ Number Analyzer
        For a given number n, display:
        Even or Odd
        Positive or Negative
        Greater than 100 or not
        👉 Uses relational + logical + ternary operators*/

        System.out.print("Enter number : ");
        double number = scan.nextDouble();

        String result = ( ( number %2 == 0 ) ? "Even number" : "Odd number" );
        
        String positiveOrNegative  = ( ( number < 0) ? "Negative" : ((number > 0 ) ? "Positive" : "zero") );

        String graterOrNot = ( (number > 100) ? "Greater then 100" : "Less then 100");


        System.out.println("Entered number is : " + result);
        System.out.println("Entered number is : " + positiveOrNegative);
        System.out.println("Entered number is : " + graterOrNot);




        scan.close();
    }
}