import java.util.Scanner;

public class MenuSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        // exits from loop when user choose 4;

        do {
            System.out.println("\n1. Say hello.");
            System.out.println("2. Show nubeer.");
            System.out.println("3. Exit");

            System.out.print("Choose option : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello");
                    break;

                case 2:
                    System.out.println("Number : 100");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice : " + choice);
                    break;
            }

        } while (choice != 3);

        System.out.println("Bu bye!");
        scan.close();
    }
    
}