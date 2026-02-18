import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        System.out.print("Enter the number you want count digit of : ");
        int number = scan.nextInt();

        int count = 0;

        while (number != 0) {
            
            number = number / 10;
            count ++;
        }

        System.out.println("Digits : " + count);

        scan.close();
    }
}