import java.util.*;
public class votingEligibility {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // program to check person is eligible for voting or not?

        System.out.print("Are you citizen of this country?");
        System.out.print("Type : true if you are, Type : flase if you'r not.");
        boolean isCitizen = scan.nextBoolean();
        
        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        if (age > 20 && isCitizen ) {
            System.out.println("You can vote.");
        }else {
            System.out.println("Yes. You can vote.");
        }

        scan.close();
    }
}