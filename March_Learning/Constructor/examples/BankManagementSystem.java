class bankClass {
	// created class and attributes
	int accountNumber;
	int balance;
	// constructor
	bankClass( int aN, int bLn){
		accountNumber = aN;
		balance = bLn;
	}
	// method to display info stored in our constructor
	void displayInfo(){
		System.out.print("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}

public class BankManagementSystem {

	public static void main(String[] args) {
		// object wiht constructor values
		bankClass b1 = new bankClass(1122, 1999);
		b1.displayInfo();
	}
}