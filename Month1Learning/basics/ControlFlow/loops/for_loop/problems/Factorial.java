import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        // int num=5;
        // int factorial = 1;

        // for (int i = 1; i <= num ; i++) {
        //     factorial *= i;
        // }

        // System.out.println(factorial);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number you want factorial of : ");
        int number = scan.nextInt();

        int facotrial = 1;

        for (int i = 1; i <= number ; i++ ) {
            
            facotrial *= i;
        }

        System.out.println(facotrial);

        scan.close();
    }
}