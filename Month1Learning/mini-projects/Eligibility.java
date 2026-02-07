/* 
5️⃣ Eligibility Checker (Real-Life Logic)
Input:
Age
Citizenship (1 = yes, 0 = no)

Output:
Eligible to vote or not
👉 Uses logical operators (&&)
*/

import java.util.*;

public class Eligibility {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Input: Age, Citizenship (1 = yes, 0 = no)
        System.out.print("Enter the age to check you are eligible or not for voting : ");
        int age = scan.nextInt();

        System.out.print("Do you have citizenship? If you have then, press 1. If you don't then press 0. Enter value = ");
        int Citizenship = scan.nextInt();



        // String result = ( (age >= 21 && Citizenship == true) ? "You can vote." : "No you are not eligible to vote."  );

        String result = ( (age >=18 && Citizenship == 1) ? "You can vote." : "You can't vote." );

        System.out.println(result);



        scan.close();
    }
}