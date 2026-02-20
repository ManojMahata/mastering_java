import java.util.*;

public class numberGuessing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberToGuess = 12;
        int guessedNumber = 0;

        while (guessedNumber != numberToGuess) {
            System.out.print("Guess the number : ");
            guessedNumber = scan.nextInt();

            if (guessedNumber > numberToGuess) {
                System.out.println("Guessed too high.");
            } else if (guessedNumber < numberToGuess) {
                System.out.println("Guessed too low.");
            }
        }
        System.out.println("Correct guess : " + numberToGuess);

        scan.close();
    }
}