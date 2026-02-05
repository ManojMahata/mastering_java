// Discount Calculator: If a customer is a member (boolean), apply a 15% discount to the price. If not, apply 0%.

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        
        System.out.println("Total price : Rs.1100");

        double price = 1200;

        System.out.println("Are you a member? ");

        boolean ifMember = true;

        double discount = ( (ifMember == true) ? ((price*15)/100) : ( (price*0)/100) );

        System.out.println("Total discout you got : " + discount);

        scan.close();


    }
}