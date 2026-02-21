import java.util.*;

public class BankAccountManagementSysetm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String accountHolder = "manoj";
        
        String accountNumber = "12345";

        String enteredAccountNumber = "";

        String loginPassword = "manoj123";
        
        String enteredPassword = "";

        int bankBalance = 0;

        boolean login = false;
        
        
        int choice = 0;


do {
            System.out.print("Enter account number : ");
            enteredAccountNumber = scan.next();
            System.out.print("Enter your password to login : ");
            enteredPassword = scan.next();

        if (enteredAccountNumber.equals(accountNumber) && enteredPassword.equals(loginPassword)) {

            login = true;

            do {

                
               
                    System.out.println("\nWelcone : " + accountHolder);
                    System.out.println("Choose operation you want to perform.");
                    System.out.println("1. Check your balance.");
                    System.out.println("2. Withdrwad money.");
                    System.out.println("3. Deposite money.");
                    System.out.println("4. Exit");

                    System.out.print("you choice : ");
                    choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("\nCurrent bank balance is : " + bankBalance);
                            break;

                        case 2:
                            System.out.print("Enter the amount you want to withdraw : ");
                            int withdrawAmount = scan.nextInt();

                            if (withdrawAmount > bankBalance) {
                                System.out.println("Opps! you dont have that much money to withdraw. ");
                                System.out.println("Your current bank balance is : " + bankBalance);
                            } else if (bankBalance == 0){
                                System.out.println("Withdrawal unsuccessful. Bank balance is " + bankBalance);
                            }
                              else {
                                bankBalance -= withdrawAmount;
                                System.out.println("Withdrawal of : " + withdrawAmount + " is successful and current bank balance is : " + bankBalance);
                            }
                            break;

                        case 3:
                            System.out.print("Enter the amount you want to deposite : ");
                            int deposite = scan.nextInt();

                            if (deposite < 0 && deposite == 0) {
                                System.out.println("Can't deposite 0 or negative amount of money.");
                            } else{
                                bankBalance += deposite;
                                System.out.println("Deposite of " + deposite + " was successful. Your current bank balance is : " + bankBalance);
                            }
                            break;

                        case 4: 
                            System.out.println("User want to exit. ");
                            System.out.println("Existing...");
                            break;

                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }

                

                } while (choice != 4);


        }

    } while (login != true);

        scan.close();

    }
}