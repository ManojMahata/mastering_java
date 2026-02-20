import java.util.*;

public class wordGuessing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wordToguess = "ippo";
        String guessedWord = "";

        while (!guessedWord.equals(wordToguess)) {
            System.out.print("Guess the word : ");
            guessedWord = scan.next();

            if (guessedWord != wordToguess) {
                System.out.println("Guessed wrong! Try again.");
            }

        }

        System.out.println("Guessed correct " + guessedWord);


        scan.close();
    }
}