import java.util.Scanner;

public class BillCalculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Ask units for 5 customers
        // Rate = 10 per unit
        // Print each bill
        int ratePerUnit = 10;

        for (int i= 1; i <= 5 ; i ++ ) {
            
            System.out.print("Enter units of customer " + i + " : ");
            int enterUnits = scan.nextInt();

            int bill = enterUnits * ratePerUnit;

            System.out.println(" Bills : Rs. " + bill);



        }



        scan.close();
    }
}