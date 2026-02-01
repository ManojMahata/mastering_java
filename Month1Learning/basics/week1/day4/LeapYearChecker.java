import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program calculates leap year.");
        System.out.print("Enter the year: ");
        
        int year = input.nextInt();

        // A year is a leap year if:
        // 1. It is divisible by 4 AND not divisible by 100
        // OR 2. It is divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        input.close();
    }
}