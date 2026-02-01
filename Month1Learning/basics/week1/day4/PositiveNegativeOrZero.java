import java.util.*;

public class PositiveNegativeOrZero{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		// program to check given number is positive or negative or zero?
		/* if number is < 0 then its negeative 
			if number is > 0 then its positive
				otherwise its 0
				*/

		System.out.print("Enter the number you want to check kid: ");
		double number = scan.nextDouble();

		if (number < 0) {
			System.out.print("Entered number is negative.\n");
		} else if (number > 0) {
			System.out.print("Entered number is positive.\n");
		} else{
			System.out.print("Entered number is zero.\n");
		}

	}
}