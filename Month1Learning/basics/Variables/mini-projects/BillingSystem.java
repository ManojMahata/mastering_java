//Simple Billing System

import java.util.*;

public class BillingSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // input : item price and quantity
        System.out.print("Price of select item : ");
        double price = scan.nextDouble();

        System.out.print("Quantity of select item : ");
        double quantity = scan.nextDouble();

        /* Output
        Total cost
        Discount applied (if any)
        Final amount */
        double totalCost = price * quantity;
        System.out.println("Total cost is : " + totalCost);

        double discount = (totalCost * 3)/ 100;
        System.out.println("Discount you got : " + discount);

        totalCost -= discount;
        System.out.println("Final cost is : " + totalCost); 




        /* Concepts:
        Variable updates
        Compound assignment (+=)
        Logical thinking*/


        scan.close();
    }
}