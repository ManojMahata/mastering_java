import java.util.Scanner;

public class problemthree {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = scan.nextInt();


        double percentage = marks;

        System.out.println(percentage);


        System.out.println("Let's check ASCII value of enterd marks.");

        char charValue = (char) marks;
        System.out.println( "ASCII of integer "  + marks + " is : " + charValue);


        scan.close();
    }
}