
class BankSystemClass {
	// attributes;
	int accountNumber;
	int balance;

	// method to deposite amount
	void depositeMethod (double amount) {
		if (amount > 0){
			balance += amount;
			System.out.println("Deposite: " + amount);
		} else {
			System.out.println("Invalid deposite amount.");
		}
	}

	void withdrawMethod(double amount) {
		if (amount > balance || amount <= 0){
			System.out.println("Invalid withdrawal amount: " + amount);
		} else {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}
	}

	// display method
	void displayInfoMethod() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current balance: " + balance);
	}
}

public class Bank {

	public static void main(String[] args) {
		BankSystemClass b1 = new BankSystemClass();
		b1.accountNumber = 1234;
		b1.balance = 100;

		b1.depositeMethod(99);
		b1.withdrawMethod(200);

		b1.displayInfoMethod();

		BankSystemClass b2 = new BankSystemClass();
		b2.accountNumber = 1111;
		b2.balance = 199;

		b2.depositeMethod(1);
		b2.withdrawMethod(50);

		b2.displayInfoMethod();
	}
}