/*
Day 2 — Number Guessing Game
Computer picks a random number (use Math.random()), user keeps guessing until correct. Perfect for while loop, if-else, and operators. Add a "you have 5 attempts only" feature using a for loop with a counter.
*/
import java.util.*;

public class NumberGuessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1. Generate a random number between 1 and 100
		int min = 1;
		int max = 100;
		int secretNumber = min + (int) (Math.random() * ((max - min) + 1));

		int guess;
		int attempst = 0;

		System.out.println("\nWelcome to Number Guessing Game!");
		System.out.println("I'm thinking of a number between " + min + " and " + max + ".");

		do {

			System.out.print("Enter your guess: ");
			guess =  scan.nextInt();
			attempst++;

			if (guess == secretNumber)
				System.out.println("Right guess." + guess + " is right number.");
			else if(guess<secretNumber)
				System.out.println("Guessed too low, try again!");
			else
				System.out.println("Guessed too high, try again!");

		} while (guess != secretNumber);


		scan.close();
	}
}