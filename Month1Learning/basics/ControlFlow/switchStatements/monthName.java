import java.util.Scanner;

public class monthName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number between 1 to 12 : \n");
        System.out.print("  ");
        int number = scan.nextInt();

        System.out.println("Kid you choosed : " + number);

        switch (number) {

        case 1 : System.out.println("Janauary is the month according to number you have entered.");
            break;

        case 2 : System.out.println("February is the month according to number you have entered.");
            break;

        case 3 : System.out.println("March is the month according to number you have entered.");
            break;

        case 4 : System.out.println("April is the month according to number you have entered.");
            break;

        case 5 : System.out.println("May is the month according to number you have entered.");
            break;

        case 6 : System.out.println("June is the month according to number you have entered.");
            break;

        case 7 : System.out.println("July is the month according to number you have entered.");
            break;

        case 8 : System.out.println("August is the month according to number you have entered.");
            break;

        case 9 : System.out.println("September is the month according to number you have entered.");
            break;

        case 10 : System.out.println("October is the month according to number you have entered.");
            break;

        case 11 : System.out.println("November is the month according to number you have entered.");
            break;

        case 12 : System.out.println("December is the month according to number you have entered.");
            break;

        default : System.out.println("Reminder : Enter number between 1 to 12.");
        }




        scan.close();
    }
}