abstract class BankAccount{
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public double getBalance(){
		return balance;
	}

	// protected setter method for balance
	protected void setBalance(double balance){
		this.balance = balance;
	}

	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
}

class SavingAccount extends BankAccount{

	public SavingAccount(String accountNumber, double balance){
		super(accountNumber , balance);
	}

	public void deposite(double amount){
		setBalance(getBalance() + amount);
		System.out.println("Deposite of $" + amount);
	}

	public void withdraw(double amount){
		if (getBalance() >= amount){
			setBalance(getBalance() - amount);
			System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
		} else {
			System.out.println("Insufficient balance. Withdrawal failed.");
		}
	}

}

class CurrentAccount extends BankAccount{
	public CurrentAccount(String accountNumber, double balance){
		super(accountNumber, balance);
	}

	public void deposite(double amount){
		setBalance(getBalance() + amount);
		System.out.println("Deposite of $"+ amount + " successful. Current Balance: " + getBalance());
	}

	public void withdraw(double amount) {
		if(getBalance() >= amount){
			setBalance((getBalance() - amount));
			System.out.println("Withdrawal successful of $" + amount + " New Balance is: " + getBalance());
		}
		else {
			System.out.println("Insufficient funds. Withdrawal failed");
		}
	}
}


public class p3{
	public static void main(String[] args) {
		double ibal, damt, wamt;

		ibal = 1000;
		SavingAccount savingAccount = new SavingAccount("L048115566225001", ibal);

		System.out.println("Savings A/c: Initial Balace: $" + ibal);

		damt = 500;
		savingAccount.deposite(damt);

		wamt = 250;
		savingAccount.withdraw(wamt);

		wamt = 1700;
		System.out.println("\nTry to withdraw: $" + wamt);
		savingAccount.withdraw(wamt);

		System.out.println();

		ibal = 5000;
		CurrentAccount currentAccount = new CurrentAccount("LBS048115566225001", ibal);
		System.out.println("Current A/c: Initial Balance: $" + ibal);

		damt = 2500;
		currentAccount.deposite(damt);

		wamt = 1250;
		currentAccount.withdraw(3000.0);

		wamt = 6000;
		System.out.println("\nTry to withdraw: $" + wamt);
		savingAccount.withdraw(wamt);

	}
}