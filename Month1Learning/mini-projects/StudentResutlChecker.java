/*
3️⃣ Student Result Checker
Input:
Marks (0–100)

Output:
Pass or Fail
Grade (A/B/C/Fail)
👉 Uses relational + ternary operators
*/

import java.util.*;
public class StudentResutlChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your marks kid : ");
        double marks = scan.nextDouble();

        String passOrFail = ( ( marks >= 40 ) ? "Pass" : "Fail");
        String grade = ( (marks < 40) ? "Fail" : ( ( marks >= 40 && marks < 60 ) ? "Gread C" : ( marks >=60 && marks < 80) ? "Gread B" : ( marks >= 80 && marks < 100 ) ? "Gread " : "Nigga you got gread A++" ));

        System.out.println("You " + passOrFail + " Paul." + " and Gread is : " + grade);


        scan.close();
    }
}