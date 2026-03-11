class BankAccount {
	// attributes and encapsulation
	private double balance;

	// method to depoiste
	public void deposite(double amount) {
		balance += amount;
	}

	// method to get info 
	public double getbalance(){
		return balance;
	}
}// BankAccount class closed.

public class En {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(); // object created
		// encapculation add now user cann't directly change banace variable of BankAccount class.

		b.deposite(1000);
		System.out.println(b.getbalance());
	}
}