

public class largestNumber {

    public static void main(String[] args) {
        
        int nubmer = 23;
        int number2 = 32;
        int number3 = 232;

        if (nubmer > number2 && nubmer> number3) {
            System.out.println(nubmer + " is greates.");
        } else if (number2 > nubmer && number2 > number3) {
            System.out.println(number2 + " is greates.");
        } else {
            System.out.println(number3 + " is greates.");
        }

    }
}