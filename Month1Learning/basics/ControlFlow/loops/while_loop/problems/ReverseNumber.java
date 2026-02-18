import java.util.Scanner;


public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number you want to check reverse of : ");
        int number = scan.nextInt();

        int reverseNumber = 0;

        while (number != 0) {
            
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;

            number = number/10;

        }
        System.out.println(reverseNumber);

        scan.close();
    }
}