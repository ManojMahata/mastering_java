import java.util.*;

public class PasswordLength {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 3 ; i++ ) {
            
            System.out.print("Enter your password : ");
            String password = scan.next();

            if (password.length() >= 8) {
                System.out.println("Your password is strong.");
            } else {
                System.out.println("Weak password.");
            }

        }


        scan.close();
    }
}