import java.util.*;

public class dayToname{
    public static void main(String[] args){
        // Scanner class to scan user input 
        Scanner scan = new Scanner(System.in);

       	 int number;
         String day = "";

        /*
            day to name convertor is like:
            sunday is day 1, monday is day 2 so on saturday is day7
            user will enter the number from 1 to 7 and program should return the day name

            now we need user input and comparision of the input so we gonna use switch statemet

        */

        System.out.println("Welcome kid, you want to check about days.");
        
        

        do{

            System.out.print("Enter 8 to exit the program.");
            number = scan.nextInt();

            if (number == 8) {
                System.out.print("You choosed to exti the program kid.\n");
		      break; // breaks the loop 
                }

            if (number < 1 || number > 8 ) {
                System.out.println("Invalid choise.");
                continue; // skips the other loops and starts from top
            }

            System.out.print("Enter number kid: ");
            number = scan.nextInt();

            
            boolean validDay = true;

            String result = day;

            switch(number){

                    case 1: result = "Sunday";
                        break;
            }

            if (validDay) {
                System.out.print(number+ " is: "+result);
            }

        } while (number != 8);



        scan.close();
    }
}
