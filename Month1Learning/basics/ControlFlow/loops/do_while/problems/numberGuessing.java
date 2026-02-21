import java.util.Scanner;

public class numberGuessing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cNum = 12;
        int gNum;

        do {
            System.out.print("Guess the number : ");
            gNum = scan.nextInt();

            if (gNum != cNum) {
                System.out.println("Wrong guess! try again");

                if (gNum > cNum) {
                    System.out.println("Guessed too high");
                } else if (gNum < cNum) {
                    System.out.println("Guessed too low.");
                }

            }
        } while (gNum!=cNum);
        System.out.println("Correct guess: " + gNum + " is correct number.");

        scan.close();
    }
}