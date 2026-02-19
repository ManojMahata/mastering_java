import java.util.*;

public class LoginSystem {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        String correctPassword = "java123";
        String input = "";

        while (!input.equals(correctPassword)) {
            
            System.out.print("Enter password : ");
            input = scan.next();

            if (!input.equals(correctPassword)) {
                
                System.out.println("Wrong password. Try again.");
            }
        }

        System.out.println("Login successfull.");

        scan.close();
    }
}