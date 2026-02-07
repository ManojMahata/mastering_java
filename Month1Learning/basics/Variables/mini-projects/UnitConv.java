import java.util.*;

public class UnitConv {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // unit converting program 

        /* 🟢 Mini Project 3: Unit Converter

        Convert:
        Celsius → Fahrenheit
        Rupees → Dollars
        Kilometers → Meters */

        final double usd_Rate = 0.0069; // 
        final double km_In_m = 1000; //

        double celsius, rupees, kilometers;

        System.out.print("Enter temprature value in celsius : ");
        celsius = scan.nextDouble();
        System.out.println(celsius + " Celsius is " + (celsius*1.8) + 32 + " in Fahrenheit");

        System.out.print("Enter total rupess : ");
        rupees = scan.nextDouble();
        System.out.println(rupees + " rupees are : " + (rupees * usd_Rate) + " Dollars");

        System.out.print("Enter the kilometer you want to change in meter : ");
        kilometers = scan.nextDouble();
        System.out.println(kilometers + " kilometer is : " + (kilometers * km_In_m) + "meter.");


    

        /*
        Concepts:
        Type conversion
        Constants (final)
        Precision control */


        scan.close();
    }
}