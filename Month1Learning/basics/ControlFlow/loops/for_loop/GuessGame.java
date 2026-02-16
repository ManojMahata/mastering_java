import java.util.*;

public class GuessGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int correctNumber = 7;

        for (int attempt = 1; attempt <=5; attempt ++ ) {
            
            System.out.print("Guess the number : ");
            int guess = scan.nextInt();

            if (guess == correctNumber) {
                System.out.println("Correct! You win.");
                break;
            } else {
                System.out.println("Wrong! Attemps left : " + (5 - attempt));
            }
        }



        scan.close();
    }
}