import java.util.Scanner;

class atmClass{
	// class starts
	// attributes..
	int accountNumber;
	String accountHolderName;
	double bankBalance;

	// constructor to initialize values in class's variables
	atmClass(int a, String b, double c){
		accountNumber = a;
		accountHolderName = b;
		bankBalance = c;
	} // constructor closed

	// method to deposite money
	void methodTodepositemoney(double depositeAmount){
		if ( depositeAmount <= 0){
			System.out.println("Invalid deposite amount.." + depositeAmount);
		} else {
			System.out.println("Depoisted Amount: " + depositeAmount);
			bankBalance += depositeAmount;
		}
	}

	// method to withdraw money
	void methodTowithdrawmoney(double withdrawalAmount){
	double minimumBalance = 500;

		 if ( withdrawalAmount > bankBalance || withdrawalAmount <= 0 ){
			System.out.println("Invalid amount to withdrawn: " + withdrawalAmount);
		}// minimum bank balance requirement is 500..
			else if( bankBalance - withdrawalAmount <= minimumBalance){
			System.out.println("Sorry can't withdraw entered money: " + withdrawalAmount + " Minimum bankbalance requiremt is: " + minimumBalance);
		}	else {
			System.out.println("Withdrawn Amount: " + withdrawalAmount);
			bankBalance -= withdrawalAmount;
		}
	}

	// void method to print bank balance
	void methodToshowBankBalance(){
		if (bankBalance < 500){
			System.out.println("Welcome " + accountHolderName + "\nAccount Number: " +accountNumber);
			System.out.println("You don't have minimum balance.");
			System.out.println("Current balance is: " + bankBalance);
		} else {
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Bank Balance: " + bankBalance);
		}

	}
	// class closed
}

//  main class and main method

public class ucsimpleATMsystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// object creation using constructor
		atmClass a1 = new atmClass(1234, "Manoj", 300);
		int choice;

		do{

		System.out.println("\n==== Welcome to ATM ====");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposite Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit Program");
		System.out.print("Enter choice: ");
		choice = scan.nextInt();

			switch (choice) {

				case 1:
					a1.methodToshowBankBalance();
					break;

				case 2:
					System.out.print("Enter Deposite Amount: ");
					double depositeamount = scan.nextDouble();
					a1.methodTodepositemoney(depositeamount);
					break;

				case 3:
					System.out.print("Enter amount to withdraw: ");
					double withdraw = scan.nextDouble();
					a1.methodTowithdrawmoney(withdraw);
					break;

				case 4:
					System.out.println("Thank you for using our ATM.");
					break;

				default:
					System.out.println("Invalid choice " + choice);
					break;
			}
		} while (choice != 4);
		System.out.println("Back whenever you want.");

		scan.close();
		//closed main method.
	}
	// closed main class
}