

import java.util.Scanner;

public class menuBasedATM {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double Balance = 1200;
        
        System.out.print("Enter 1 to check your Balance.\n");
        System.out.println("Enter 2 for Withdraw.");
        System.out.println("Enter 3 to Deposit.");
        System.out.println("Enter 4 to exit.");
        System.out.print("Enter number : ");
        int number = scan.nextInt();

        /* Menu-based ATM
        1 → Check Balance
        2 → Withdraw
        3 → Deposit
        4 → Exit
        */

        switch ( number ) {
        case 1: System.out.println("Your current balance is : " + Balance);
            break;

        case 2: System.out.println("You want to withdraw.");
            
            System.out.print("Enter amount you wan to withdraw : ");
            double withdraw = scan.nextDouble();

            if (withdraw > Balance) {
                System.out.println("Sorry not enought balance.");
            } else {
                System.out.println("You withdraw " + withdraw + " and now your current balance is : " + (withdraw - Balance));
            }
            break;

        case 3: System.out.print("How much you want to Deposit? ");

            double deposite = scan.nextDouble();
            System.out.println("Now, your balance is : " + (deposite + Balance));
            break;

        case 4: System.out.println("User wants to exit. Bu bye (^__^)");
            break;


        default: System.out.println("Invalid input.");
        }


        scan.close();
    }
}