import java.util.*;

public class miniProject {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter total marks you got kid : ");
        int marks = scan.nextInt();

        System.out.print("Your total subjects : ");
        int subjects = scan.nextInt();

        double average = (double) marks/subjects;
        System.out.println(average);




        scan.close();
    }
}