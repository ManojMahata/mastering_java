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
		BankAccount b1 = new BankAccount();
		b1.deposite(500);
		System.out.println("Balance after deposite: " + b1.getBalance());
		b1.withdraw(400);
		System.out.println("Balance after withdraw: " + b1.getBalance());
	}
}