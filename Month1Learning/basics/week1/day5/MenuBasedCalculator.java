import java.util.*;


public class MenuBasedCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int operation;

        System.out.print("Welcome to menu based calculation program. \n");

        System.out.print("Choose the Operations\n");
        System.out.print("1 for (+)\n");
        System.out.print("2 for (-)\n");
        System.out.print("3 for (*)\n");
        System.out.print("4 for (/)\n");
        System.out.print("5 for exit the program.\n");

        System.out.print("Choose: ");
        operation = scan.nextInt();

        System.out.print("User choosed "+operation+" operation.\n");

        double num1, num2;
        System.out.print("Enter first number: ");
        num1 = scan.nextDouble();

        System.out.print("Enter first number: ");
        num2 = scan.nextDouble();

        System.out.print("User entered "+num1+ " then "+num2+ " .\n");


        // variables to do operation
        double add,min,mul,div, result = 0;



        switch (operation) {
            case 1: add = num1 + num2;
                result = add;
                break;

            case 2: min = num1 - num2;
                result = min;
                break;

            case 3: mul = num1 * num2;
                result = mul;
                break;

            case 4: if (num1 != 0) {
                div = num1/num2;
                result = div;
                break;
            }
            
            default: System.out.print("User entered invalid operation.\n");
        }

        System.out.print("Result: "+result+" \n");

        while(operation != 5);



       

        scan.close();
    }
}