import java.io.*;

// Unary

public class Unary {

    public static void main(String[] args){

        //integer declared
        int a = 10;
        int b = 10;

        // using unary operators
        System.out.println("Postincrement: "+(a++));// here value of a is increased and it 11 now but it's not going to print in this statement.

        System.out.println("now value of a: "+a); // now a value will be 11;

        // currently a's value is 11 
        // now let's try preincrement

        System.out.println("Preincrement: "+ (++a));// here we don't need to print a's value, it increased first and printed.

        // Postincrement prints the statement first and increases value, in Preincrement value is increased first then statement are printed.

        // same for Postdecrement and Predecrement

        // currently value of a = 12

        System.out.println("Predecrement value of a: "+ (a--));
        // here value of a became 11 but it won't be printed.

        System.out.println("Now value of a should be 11. The value of a: " +a );

        // predecrement 
        
        // current value of a = 11, now after doing predecrement it should be: 10
        System.out.println("The value of a is now: " + (--a));


    }
}