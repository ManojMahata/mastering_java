import java.util.Scanner;

class BankAccount{
	// attributes in private
	private double balance;

// method to deposite money
	public void deposite (double amount) {
		if (amount > 0) {
			balance += amount;
		} else if (amount <= 0) {
			System.out.println("Invalid amount entered to deposite: " + amount + " Amount must be grater then 0.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Invalid amount: " + amount);
		}
	}

	public double getBalance () {
		return balance;
	}
// class close
}

public class BankSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		BankAccount b1 = new BankAccount();
		System.out.print("Enter Deposite Amount: ");
		double depositeAmount = scan.nextDouble();
		b1.deposite(depositeAmount);
		System.out.println("Balance Balance after deposite: " + b1.getBalance());

		System.out.print("Enter Withdraw Amount: ");
		double withdrawAmount = scan.nextDouble();
		b1.withdraw(withdrawAmount);
		System.out.println("Balance after withdraw: " + b1.getBalance());
		scan.close();
	}
}