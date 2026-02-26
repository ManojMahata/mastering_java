import java.util.*;

public class CbankAccoutnManagementSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // accoutn details 
        String accountHolder = "manoj";
        String accountNumber = "12345";
        String loginPassword = "manoj123";

        // balance things
        double bankBalance = 0.0;

        // transaction history
        String transaction1 = "", transaction2 = "", transaction3 = "";

        int transactionCount = 0;

        boolean loggedIn = false;
        int loginAttempts = 0;
        int choice = 0;

        while (!loggedIn && loginAttempts < 3) {
            System.out.print("Enter account number : ");
            String enteredAccount = scan.next();
            System.out.print("Enter Login password : ");
            String enteredPassword = scan.next();

            if (enteredAccount.equals(accountNumber) && enteredPassword.equals(loginPassword)) {
                
                loggedIn = true;
                System.out.println("\nWelcome, " + accountHolder + "!");
            } else {
                loginAttempts++;
                System.out.println("Invalid Crendentials. Attemps left: " + (3 - loginAttempts));
            }
        }

        // if all 3 attempts failed, lock and exit

        if (!loggedIn) {
            System.out.println("Account locked after 3 failed attempts. Goodbye!");
            scan.close();
            return;
        }

        // main menu loop (do-while - runs at least once)

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposite");
            System.out.println("4. Transaction History");
            System.out.println("5. Interest Calculator");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Current Balance : Rs. %.2f%n", bankBalance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scan.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Enter a valid amount");
                    } else if (withdrawAmount >bankBalance) {
                        System.out.println("Insufficient balance! Available: Rs." + bankBalance);
                    } else {
                        bankBalance -= withdrawAmount;
                        System.out.printf("Withdraw Rs. %.2f | New Balance: Rs. %.2f%n", withdrawAmount, bankBalance);

                        // save transaction without array
                        String newTransaction = "Withdrawn: Rs. " + withdrawAmount;

                        if ( transactionCount == 0 )
                            transaction1 = newTransaction;

                        else if ( transactionCount == 1)
                            transaction2 = newTransaction;

                        else if ( transactionCount
                         == 2)
                            transaction3 = newTransaction;

                            if ( transactionCount < 3)
                                transactionCount++;
                    }
                    break;

                case 3:
                    System.out.print("Enter aount to deposite: ");
                    double depositeAmount = scan.nextDouble();

                    if (depositeAmount <= 0) {
                        System.out.println("Invalid amount");
                    } else {
                        bankBalance += depositeAmount;
                        System.out.printf("Deposite Rs. %.2f | New Balance: Rs. $2.f%n", depositeAmount, bankBalance);

                        // save transaction without array
                        String newTransaction = "Deposite: Rs. " + depositeAmount;

                        if ( transactionCount == 0)
                            transaction1 = newTransaction;
                        else if ( transactionCount == 1)
                            newTransaction = transaction2;
                        else if ( transactionCount == 2)
                            transaction2 = newTransaction;
                        else if (transactionCount == 3)
                            transaction3 =newTransaction;
                    }
                    break;

                case 4:
                    // for loop to print history - no array neede!
                    System.out.println("\n--- Tranaction History (Last 3) ---");
                    if (transactionCount == 0) {
                        System.out.println("No transaction yet.");
                    } else {
                        // for loop counts fro 1 to transactionCount
                        for ( int i = 1; i <= transactionCount; i++) {

                            if ( i == 1)
                                System.out.println(i + ". " + transaction1);
                            else if ( i==2)
                                System.out.println(i + ". " + transaction2);
                            else if (i==3)
                                System.out.println(i + ". " + transaction3);
                        }
                    }
                    break;

                case 5:
                    // type casting - interest calculator
                    System.out.print("Enter number of year: ");
                    int years = scan.nextInt();
                    double rate = 5.0;
                    double interest = bankBalance * rate * years / 100;
                    double total = bankBalance + interest;
                    int wholeRupees = (int) total;
                    System.out.printf("After %d years at 5%% interest: Rs. %.2f (appros Rs. %d)%n", years, total,wholeRupees);
                    break;

                case 6:
                    System.out.println("Thank you for banking with us. Goodbye!");
                    break;
            
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

        } while (choice != 6);




        scan.close();
    }
    
}