import java.util.*;

public class ImporvedMenuBasedCal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int operation; 

        // to keep program into loop we will use do-while loop
        do{

            System.out.println("\n--- Menu Based Calculator ---");
            System.out.println("1 for (+)");
            System.out.println("2 for (-)");
            System.out.println("3 for (*)");
            System.out.println("4 for (/)");
            System.out.println("5 to Exit");
            System.out.print("Choose: ");
            operation = scan.nextInt();

            if (operation == 5) {
                System.out.println("Existing program. Bu bye!");
                break; // exits loop immediately.
            }

            if (operation <1 || operation > 5) {
                System.out.println("Invalid choice. Please try again.");
                continue; // skip the rest of the loop and show menu again.
            }

            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();

            double result = 0;
            boolean validOp = true;

            switch(operation){
                case 1:
                    result = num1 + num2;
                    break;

                case 2: result = num1 - num2;
                    break;

                case 3: result = num1 * num2;
                    break;

                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: cannot divide by zero.");
                        validOp = false;
                    }
                    break;
            }

            if (validOp) {
                System.out.println("Result: " + result);
            }

        } while (operation != 5);

        scan.close();


    }

}