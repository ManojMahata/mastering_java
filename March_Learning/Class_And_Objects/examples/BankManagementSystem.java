import java.util.Scanner;

class BankAccount {
	Scanner scan = new Scanner(System.in);
	//BankAccount Class
	// Now time to add Attributes

	String accountHolder;
	double bankBalance = 0.0;
	// time to add mathods
	// deposite
	void depositeMethod() {
		System.out.print("\nEnter deposite amount: ");
		double deposite = scan.nextDouble();
		bankBalance += deposite;
		System.out.println("Deposite successful of amount: " + deposite + " ,and Current new Bank Balance is: " + bankBalance);
	}

	void withdrawMethod(){
		System.out.print("\nEnter the ammount you want to withdraw: ");
		double withdrawAmount = scan.nextDouble();
		if(withdrawAmount > bankBalance){
			System.out.println("Insufficient funds..");
		}
		else{
			bankBalance -= withdrawAmount;
			System.out.println("Withdrawl successful of amount: " + withdrawAmount + ", and Remaining balance is: "+ bankBalance);
		}
	}

	// method to show balance/ current balance
	void showBalanceMethod(){
		System.out.println(accountHolder + "'s, Current neat bank balance is: "+bankBalance);
	}

}

public class BankManagementSystem{
	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		account.accountHolder = "Manoj Mahata";

		account.depositeMethod();
		account.withdrawMethod();
		account.showBalanceMethod();

	}
}