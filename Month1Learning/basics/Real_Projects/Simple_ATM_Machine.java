/* Day 3 — Simple ATM Machine
Similar to the bank project but simpler — no login, just withdraw/deposit/balance check. Focus here is writing it faster and cleaner than the bank project. Speed and confidence building. */

import java.util.Scanner;
public class Simple_ATM_Machine {

	public static void main(String[] args) {
		// we need to give 4 options to user withdraw/deposite/balance/exit;
		Scanner scan = new Scanner(System.in);
		double withdraw, deposite, balance = 0.0;
		int choice = 0;
		do {
			System.out.print("Enter 1 to check balance\n" + "Enter 2 for deposite\n" + "Enter 3 for withdraw\n" + "Enter 4 to exit the program\n" + "Enter: ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Your current bank balance is: " + balance);
				if (balance == 0)
					System.out.println("No money in accout!! Deposite some before withdraw.");
				break;

			case 2:
				System.out.print("Enter the amount you want to deposite: ");
				deposite = scan.nextDouble();
				balance += deposite;
				System.out.println("Current balance is: " + balance);
				break;

			case 3:
				System.out.print("Amount you want to withdraw: ");
				withdraw = scan.nextDouble();
				balance -= withdraw;
				System.out.println(withdraw + " Successful, " + balance + " is remaining balance.");
				break;

			case 4:
				System.out.println("User want's to exit");
				break;

			default:
				System.out.println("Invalid choice, try again!");
				break;
			}
		}while (choice != 4);
		System.out.println("Exited the program (:><:)");
		scan.close();
	}
}