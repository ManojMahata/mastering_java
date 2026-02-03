import java.io.*;

public class Assignment {

    public static void main(String[] args){

        // Integer declared
        int n = 10;

        // current value of n = 10
        // n = n + 5 this is the general method of incresing value of n.

        System.out.println("The value of n is currently: " + n);

        n += 5; // In this first variable is declared first and + is assigned then the value initilized is 5 so in short it becomes n += 5; in variable n add 5

        System.out.println("The value of n after += : " +n);

        // same for *=.

        // if we assign *= 2 to n then the value of n will be 30.
        // let's check

        n *= 2;

        System.out.println("The value of n after *= : " + n);

        // exactly I was right.

        // now for n -= 5;
        // the value will be 25

        n -= 5;
        System.out.println("The value of n after -= : " + n);

        // now, n /= 5;
        // output will be 5;
        // so n's value became 5;

        n /= 5;

        System.out.println("The value of n after /= : " + n);

        // Again for modulas %.
        // %=.

        n %= 2;
        // remander will be 1; 
        System.out.println("The value of n after %/ : " +n);



    }
}