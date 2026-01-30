import java.util.Scanner;

public class sumoftwonumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scan.nextInt();
		scan.nextLine();
		System.out.print("Choose the operation: +, -, * ");
		String operation = scan.nextLine();

		switch (operation) {
			case "+":
				System.out.println("Sum: " + (num1 + num2));
				break;
			case "-":
				System.out.println("Difference: " + (num1 - num2));
				break;
			case "*":
				System.out.println("Product: " + (num1 * num2));
				break;
			default:
				System.out.println("Invalid operation");
		}

		scan.close();
	}
}
