import java.util.*;

public class Stock {

    public static void main(String[] args) {

        // Stock Status: Given an int quantity, return "In Stock" if quantity > 0, and "Out of Stock" if it's 0 or less.

        Scanner scan = new Scanner(System.in);




        int quantity;


        System.out.print("Enter quantiy : ");
        quantity = scan.nextInt();

        String result = ( (quantity > 0) ? "In Stock." : "Out of Stock" );

        System.out.println(result);


        scan.close();
    }
}