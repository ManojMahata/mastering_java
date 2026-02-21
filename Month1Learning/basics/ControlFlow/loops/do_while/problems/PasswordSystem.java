import java.util.Scanner;

public class PasswordSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String correctPass = "lovejava";
        String inputPass;

        do {
            System.out.print("Enter pass : ");
            inputPass = scan.next();

            if (!inputPass.equals(correctPass)) {
                System.out.println("Wrong password.");
            }
        } while(!inputPass.equals(correctPass));

        System.out.println("Access granted.");

        scan.close();
    }
}