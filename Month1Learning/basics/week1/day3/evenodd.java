import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class evenodd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // program to check even or odd number 
        // if number is divided by 2 and % == 1 then it odd and if remainder == 0 then it is even number

        // Let's get input from the user
        System.out.print("Enter the number you want to check that it is even or odd: ");
        long number = scan.nextLong();

        if (number %2 == 0) {
            System.out.println("The given number "+number+ " is even.");
        }else {
            System.out.println("The given number "+number+ " is odd.");
        }


        scan.close();
    }

}