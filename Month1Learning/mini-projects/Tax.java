/* 
4️⃣ Salary & Tax Checker

Input:
Basic salary

Rules (example):
If salary ≥ 50,000 → Tax = 10%
Else → Tax = 5%

Calculate:
Tax amount
Final salary after tax

👉 Uses arithmetic + ternary + assignment operators
*/

import java.util.*;

public class Tax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // input from user/ salary of user as a input
        System.out.print("Enter your salary paul : ");
        double salary = scan.nextDouble();

        /*  Rules (example):
        If salary ≥ 50,000 → Tax = 10%
        Else → Tax = 5%

        Calculate:
        Tax amount
        Final salary after tax
        */

        double result = ( ( salary >= 15000 ) ? ( (salary/100) * 10 ) : ( (salary/100) * 5 ) );

        System.out.println("Tex amount : " + result);

        double finalSalary =  salary - result ;
        System.out.println("Final amount you will get paid paul : " + finalSalary);
        



        scan.close();
    }
}