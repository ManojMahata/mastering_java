import java.util.*;

public class leapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         System.out.print("Enter year you want to check : ");
         int year = scan.nextInt();

        // if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
        //     System.out.println(year + " is leap year.");
        // }else {
        //     System.out.println("invalid input.");
        // }

         if ( (year%4 == 0) && (year%100 != 0) || (year%400 == 0) ) {
             System.out.println(year + " is leap year.");
         }else {
            System.out.println(year + " is non-leap year.");
         }


        scan.close();
    }
}