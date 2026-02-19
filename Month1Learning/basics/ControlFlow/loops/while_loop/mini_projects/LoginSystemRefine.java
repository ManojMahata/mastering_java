import java.util.*;

public class LoginSystemRefine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String correctPass = "java456";
        String input = "";

        while (!input.equals(correctPass)) {
            
            System.out.print("Enter your password : ");
            input = scan.next();

            if (!input.equals(correctPass)) {
                System.out.println("Wrong password. Try again.");
            }
        }
            System.out.println("Login successfull.");


        scan.close();
    }
}