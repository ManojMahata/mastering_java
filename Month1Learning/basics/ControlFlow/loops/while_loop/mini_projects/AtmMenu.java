import java.util.*;

public class AtmMenu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int balacne = 1;

        int choice = 0;
        
        String userLoginPassword = "user123";

        String password = "";

        System.out.print("Press 1 to login. ");
        System.out.print("Press 2 to reset pin. ");
        int choiceOne = scan.nextInt();
        


        if (choiceOne == 1) {
            System.out.println("Welcome Sir, Ma'am.");
            System.out.print("Enter your password : ");
            password = scan.next();

            if (password.equals(userLoginPassword)) {
                
                System.out.println("Login successfull.");

                while (choice!=4) {
                    
                    System.out.println("\n1. Check Balance");
                    System.out.println("2. Deposite");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");

                    System.out.print("Choose option: ");
                    choice = scan.nextInt();

                    if (choice == 1) {
                        System.out.println("Your current balance is : " + balacne);
                    }
                    else if (choice ==2) {
                        System.out.print("Enter amount: ");
                        int amount = scan.nextInt();
                        balacne += amount;
                        System.out.println("Deposite successful. New balance is : " + balacne);
                    }
                    else if (choice == 3) {
                        System.out.print("Enter amount you want ot withdraw : ");
                        int amoutn = scan.nextInt();

                        if (amoutn <= balacne) {
                            balacne -= amoutn;
                            System.out.println("Withdrawl successfull of " + amoutn + " and your current balance is : " + balacne);
                        }
                        else {
                            System.out.println("Insufficient balance");
                        }
                    }
                    else if (choice == 4) {
                        System.out.println("Thank you for choosing us.");
                    }

                    else{
                        System.out.println("Invalid Option.");
                    }
                }
            }


        }
        else if (choiceOne == 2 ){
            System.out.println("This service is not available currently. We will fix this soon.");
        }else {
            System.out.println("Invalid choice.");
        }


        
        scan.close();
    }
}