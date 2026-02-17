import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number you want a patter of : ");
        String enterChar = scan.nextLine();

        for (int i = 1; i <= 5 ; i++ ) {
            
            for (int j = 1; j <= i ; j++ ) {
                System.out.print(enterChar);
            }
            System.out.println();
        }


        scan.close();
    }
}