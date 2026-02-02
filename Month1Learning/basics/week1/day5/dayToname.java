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

            System.out.print("Enter number kid (1-7) or 8 to exit the program: ");
            number = scan.nextInt();

            if (number == 8) {
                System.out.print("You choose to exit the program kid byee!\n");
		      break; // breaks the loop 
                }

            if (number < 1 || number > 7 ) {
                System.out.println("Invalid choice.\n");
                continue; // skips the other loops and starts from top
            }

            
            boolean validDay = true;

            String result = day;

            switch(number){

                    case 1: result = "Sunday";
                        break;

                    case 2: result = "Monday";
                        break;

                    case 3: result = "Tuesday";
                        break;

                    case 4: result = "Wednesday";
                        break;

                    case 5: result = "Thursday";
                        break;

                    case 6: result = "Friday";
                        break;

                    case 7: result = "Saturday";
                        break;

            }

            if (validDay) {
                System.out.print(number+ " is: "+result+"\n");
            }

        } while (number != 8);



        scan.close();
    }
}
