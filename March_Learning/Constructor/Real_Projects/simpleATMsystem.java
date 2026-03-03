import java.util.Scanner;

public class simpleATMsystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankAccount b1 = new BankAccount(1234, "Manoj Mahata", 1000); // object creation using constructor

		int choice;

		do{
			System.out.println("\n==== ATM MENU ====");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposite Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Enter Choice: ");
			choice = scan.nextInt();

			switch (choice) {
				case 1:
					b1.methodToCheckBalance();
					break;

				case 2:
					System.out.print("Enter deposit amount: ");
					double dep = scan.nextDouble();
					b1.methodToDeposite(dep);
					break;

				case 3:
					System.out.print("Enter withdraw amount: ");
					double with = scan.nextDouble();
					b1.methodToWithdraw(with);
					break;

				case 4:
					System.out.println("Thank you for using ATM!");
					break;

				default:
					System.out.println("Invalid choice!!" + choice);
					break;
			}

		} while (choice != 4);
		System.out.println("Existed...");

		scan.close();
	}
}

// create BankAccount class

class BankAccount {

	int choice =0;
	// attributes
	int accountNumber;
	String accountHolderName;
	double balance;

	//constructor
	BankAccount(int acc, String accname, double blc){
		accountNumber = acc;
		accountHolderName = accname;
		balance = blc;
	}

	// method to deposite
	void methodToDeposite(double depositeAmount){
		if(depositeAmount > 0 ){
			balance += depositeAmount;
			System.out.println("Deposited: " + depositeAmount);
		} else {
			System.out.println("Invalid deposite amount: " + depositeAmount);
		}
	}
	// method to withdraw
	void methodToWithdraw(double withdrawAmount){
		if (withdrawAmount <= balance && withdrawAmount > 0){
			balance -= withdrawAmount;
			System.out.println("Withdrawn: " + withdrawAmount);
		} else {
			System.out.println("Invalid withdraw amount: " + withdrawAmount);
		}
	}
	// method to check balance
	void methodToCheckBalance(){
		System.out.println("Current Bank Balance: " + balance);
	}

}