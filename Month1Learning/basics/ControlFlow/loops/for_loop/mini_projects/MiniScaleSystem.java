import java.util.*;

public class MiniScaleSystem {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //Ask price of 5 items, Apply 10% discount if total > 5000

        int priceOfProduct = 0;
        int total = 0;

        for (int i = 1; i <= 5 ; i++ ) {
            
            System.out.print("Enter the price of product : ");
            priceOfProduct = scan.nextInt();

            total += priceOfProduct; 
        }

        if (total > 5000) {
                int discount = (total/100)*10;

                System.out.println("Total price : " + total);
                System.out.println("Price after discoutn : " + (total - discount) );
            } else {
                System.out.println("No discount! Total price should be more then 5000.");
            }



        scan.close();
    }
}