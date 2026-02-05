import java.util.*;

public class TernaryMaxNumber {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // Problem: Pass/Fail: If score is 60 or higher, result is "Pass". Otherwise, it's "Fail"

        System.out.println("Check you passed the exam or not : ");

        System.out.print("Enter your marks  : ");
        double marks = scan.nextDouble();

        String result = ( (marks >= 60 ) ? "You passed paul." : "You failed kid.");

        System.out.println(result);


        scan.close(); 

    }
}