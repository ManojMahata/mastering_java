import java.lang.classfile.instruction.BranchInstruction;
import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
        System.out.print("Enter number you want to check : ");
        int number = scan.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number ; i++ ) {
            if (number%i == 0) {
                isPrime = false;
                break;
            }
        }

        if ( isPrime && number > 1) {
            System.out.println( number + " is Prime.");
        } else {
            System.out.println(number + " is not Prime.");
        } */


// System.out.print("Number you want to check : ");
// int number = scan.nextInt();

// boolean isPrime = true;

// for ( int i = 2; i < number; i++) {
//     if (number%i == 0) {
//         isPrime = false;
//         break;
//     }
// }

// if (isPrime && number > 1) {
    
//     System.out.println(number + " is prime");
// }
// else {
//     System.out.println(number + " isn't prime");
// }



System.out.print("Enter the number you want to check : ");
int number = scan.nextInt();

boolean isPrime = true;

for ( int a = 2; a < number; a++) {
    if ( number % a == 0 ) {
        isPrime = false;
        break;
    }
}

if ( isPrime && number > 1) {
    System.out.println(number + " is prime number.");
} else {
    System.out.println(number + " is not prime number.");
}

        scan.close();
    }
}