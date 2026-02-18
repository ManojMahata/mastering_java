import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        
        // int n = 2;
        // for (int i =1; i <= 10 ; i++) {
        //     System.out.println(n + " * " + i + " = " + (n * i));
        // }

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number you want to table of : ");
        int number = scan.nextInt();

        for (int i = 1; i <= 10 ; i++ ) {
            System.out.println(number + " * " + i + " = " + (number*i));
        }

        scan.close();

    }
}