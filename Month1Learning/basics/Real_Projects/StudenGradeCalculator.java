import java.util.*;

public class StudenGradeCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Day 1 — Student Grade Calculator
        You take marks of 5 subjects, calculate total, percentage, and assign grade (A/B/C/F) using if-else. Simple but forces you to use operators, type casting (int to double for percentage), and a for loop to print all subject marks.*/

        // varaibles 
        double marks, total = 0.0, percentage;
        int choice = 0;

        do {

            System.out.println("\nWelcome to grade calculator system.");
            System.out.println("Press 1 to continue");
            System.out.println("Press 2 for exit");
            System.out.print("Enter : ");
            choice = scan.nextInt();

            if (choice ==1 ) {
                    System.out.println("Enter your marks one by one kid.");
                    for (int i = 1; i <= 5 ; i++) {
                        System.out.print("Marks in subject " + i + " : ");
                        marks = scan.nextDouble();
                        
                        if (marks > 100 || marks <0){
                            System.out.println("Enter valid marks.");
                            break;
                        }
                        total += marks;   
                    }
                    percentage = total/5;

                    if(percentage >= 90)
                        System.out.print("Gread : A");
                    else if (percentage >= 70)
                        System.out.print("Grade : B");
                    else if (percentage >= 50)
                        System.out.println("Grade : C");
                    else if(percentage >= 40)
                        System.out.print("Grade : D");
                    else
                        System.out.print("You are fail kid!");
            }


        }while (choice != 2);
        System.out.println("Exiting...");
        System.out.println("Exit successful.");

        scan.close();
    }
}