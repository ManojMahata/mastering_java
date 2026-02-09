import java.util.*;
// if in java: 

public class If {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // let's see how if statement works

        System.out.print("Enter Integer number : ");
        int number = scan.nextInt();

        if (number > 20) {
            System.out.println("So the number is greater then 20.");
        }
        

        scan.close();
    }
}