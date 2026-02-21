
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cNum = 22;
        int gNum;

        do {
                System.out.print("Guess the number : ");
                gNum = scan.nextInt();

                if (gNum != cNum) {
                    System.out.println("Guessed wrong! Tru again.");

                    if (gNum > cNum) {
                        System.out.println("Guessed too high kid.");
                    } else if (gNum < cNum) {
                        System.out.println("Guessed too low kid.");
                    }
                }

        } while (gNum!=cNum);

        System.out.println("Guess what?");
        System.out.println("You guessed correct number kid. " + gNum + " is correct number.");


        scan.close();
    }
}