import java.util.Scanner;

// ATM class to represent the atm machine

class ATM {
	// private attributes (encapsulation)
	// cannot be accessed directly from outside the class
	private int pin;
	private double balance;

	// constructor to initialize atm acount
	ATM(int p, double b) {
		pin = p; // assign PIN when object is created
		balance = b; // assign initaial balance
	}

	// method to verify entered PIN
	public boolean verifyPin ( int enteredPin ) {
		// check if entered pin matches stored pin
		if (enteredPin == pin){
			return true;
		} else{
			return false;
		}
	}

	// method to deposite money
	public void deposite(double amount){
		// validate amount
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposite successful: " + amount);
		} else if (amount <= 0) {
			System.out.println("Invalid deposite amount: " + amount);
		}
	}

	// method to withdraw money
	public void withdrawal (double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount: " + amount);
		} else if(amount > balance){
			System.out.println("Insufficient balance!!!");
		} else{
			balance -= amount;
			System.out.println("Withdrawal successful: " + amount);
		}
	}

	// Getter method to check balance
	public double getBalance(){
		return balance;
	}

} // ATM class closed

public class AtmMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ATM atm = new ATM(1234, 1000);

		int enteredPin;

		// ask user to to enter PIN
		System.out.print("Enter your ATM PIN: ");
		enteredPin = scan.nextInt();

		// verify pin before allowin any transaction

		if (atm.verifyPin(enteredPin)){
			System.out.println("PIN verified Successfully.");

			int choice;

			// atm menu loop
			do{
				System.out.println("\n==== ATM ====");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposite");
				System.out.println("3. Withdrawal");
				System.out.println("4. Exit");
				System.out.print("Choose: ");
				choice = scan.nextInt();

				// switch to execute user choosen operation
				switch(choice){
				case 1:
					System.out.println("User total Balance: " + atm.getBalance());
					break;

				case 2:
					System.out.print("Enter Deposite amount: ");
					double deposite = scan.nextDouble();
					// call deposite method
					atm.deposite(deposite);
					break;

				case 3:
					System.out.print("Enter withdrawal amount: ");
					double wihtdrawal = scan.nextDouble();
					// call withdrawa method
					atm.withdrawal(wihtdrawal);
					break;

				case 4:
					System.out.println("Thank you for using ATM.");
					break;

				default:
					System.out.println("Invalid choice!!"+ choice);
					break;
				}// swithc statement closed
			} while(choice != 4); // do-while loop closed

		} else {
			// if pin is wrong
			System.out.println("Incorrect PIN. Access Denied.");
		}


		scan.close();
	}
}