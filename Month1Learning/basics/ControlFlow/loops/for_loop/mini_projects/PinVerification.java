import java.util.*;

public class PinVerification {

    public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);
    
    // correct pin 1234, attempt = 3, stop if incorrect.
    
    int correctPin = 1234;

    System.out.print("Welcome Sir, Ma'am\n");
    
    for (int i = 1; i <= 3 ; i++) {

        System.out.print("Please enter your pin : ");
        int enteredPin = scan.nextInt();

        if (enteredPin == correctPin) {
            System.out.println("Welcome 🙏🙏");
            break;
        } else {
            System.out.println("Pin dosen't match. Attempts left : " + (3-i))   ;
        }

        if (i == 3)
            System.out.println("Card blocked successfully.");

    }


    scan.close();
    }
    
}