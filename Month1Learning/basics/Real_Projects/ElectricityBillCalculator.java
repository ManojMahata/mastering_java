/*
Day 4 — Electricity Bill Calculator
User enters units consumed, program calculates bill using slabs (0-100 units = Rs.3/unit, 101-200 = Rs.5/unit, etc.). Heavy if-else practice with real-world logic. Add a for loop to show bills for multiple customers. */

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// variables =>
		double consumedUnits;
		int choice = 0;
		// double bill = 0.0;
		do {
			System.out.println("Enter 1 to enter into program. " + "\nEnter 2 exit.");
			System.out.print("Enter: ");
			choice = scan.nextInt();

			if (choice == 1)
				System.out.println("Calculate your electricity bill.");

//(0-100 units = Rs.3/unit, 101-200 = Rs.5/unit, etc.)
			switch (choice){
			case 1:
				System.out.print("Enter used units: ");
				consumedUnits = scan.nextDouble();
				if (consumedUnits <= 100)
				System.out.println("Total bill is: " + (consumedUnits*3) );
				else if (consumedUnits > 100)
					System.out.println("Total bill is: " + (consumedUnits * 5));
				else
					System.out.println("Invalid input.");
				break;

			case 2:
				System.out.println("Exiting...");
				break;
			}
		}while (choice != 2);

		scan.close();
	}
}