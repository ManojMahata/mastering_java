import java.util.*;
public class DividedEvenly {

    public static void main(String[] args) {
        
        // final int LIMIT = 100;

        // int var;

        // System.out.print(LIMIT + " is evenly divisible by ");

        // for ( var = 1; var <= LIMIT; ++var) 
        //     if (LIMIT % var == 0)
        //         System.out.print(var + " ");

        //     System.out.println();

/* 
Suppose you want to find all the numbers that divide evenly into 100. You want to write
a definite loop—one that executes exactly 100 times. In this section, you write a for
loop that sets a variable to 1 and increments it to 100. Each of the 100 times through
the loop, if 100 is evenly divisible by the variable, the application displays the number.
*/
Scanner scan = new Scanner(System.in);
System.out.print("Enter the number :");
int number = scan.nextInt();

System.out.println("Here are all the evenly divisible of that number : ");

for (int i = 1; i <= number ; ++i ) 
    if (number % i == 0) 
        System.out.print(i + " ");


    
System.out.println();
scan.close();
    }
}