import java.util.Scanner;

public class dayName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // program to print day according to the number.

        System.out.print("Enter number from 1 to 7 : ");
        int number = scan.nextInt();

        switch (number) {

            case 1 :
            System.out.println(number + " is Sunday.");
            break;

            case 2 :
            System.out.println(number + " is Monday");
            break;

            case 3 :
            System.out.println(number + " is Tuesday");
            break;

            case 4 :
            System.out.println(number + " is Wednesday");
            break; 

            case 5 :
            System.out.println(number + " is Thursday");
            break;

            case 6 :
            System.out.println(number + " is Friday");
            break;

            case 7 :
            System.out.println(number + " is Saturday");
            break;

        default :
            System.out.println(number + " invalid input.");

        }



        scan.close();
    }
}