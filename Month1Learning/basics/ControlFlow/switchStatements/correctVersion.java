import java.util.*;

public class correctVersion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        // what happens when we run switch statement without break;

        System.out.print("Enter number from 1 to 3 : ");
        int number = scan.nextInt();

        switch(number) {
        case 1: System.out.println("Sunday");
            break;
        case 2: System.out.println("Monday");
            break;
        case 3: System.out.println("Tuesday");
            break;
        }

        // Here, if we enter 1 and except output sunday then we will get monday and tuesday as well because we haven't used break;


        /*
        number = scan.nextInt();
        switch (number) {
            case 1:
                    System.out.println("Now, when we use break.");
                    System.out.println("Sunday");
                    break;

                case 2:
                        System.out.println("Monday");
                        break;

                    case 3: 
                            System.out.println("Tuesday");
                            break;
            default: 
                        System.out.println("Wednesday");
                    break;
        } */


        scan.close();
    }
}