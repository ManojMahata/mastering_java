import java.util.Scanner;

public class input_Validation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // keep asking until user enters positive number.

        int number;

        do {
            System.out.print("Enter the number : ");
            number = scan.nextInt();

            if (number <= 0) {
                System.out.println("Entered number is less then zero.");
                System.out.println("Please enter positive number.");
            }

        } while (number <= 0);
        System.out.println("Perfect, entered number is " + number + " and it is positive.");


        scan.close();
    }
}