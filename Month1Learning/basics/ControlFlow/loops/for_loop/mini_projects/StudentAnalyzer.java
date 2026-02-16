import java.util.Scanner;

class StudentAnalyzer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double marks, total=0, average;

        for (int i = 1; i <= 5 ; i++ ) {
            System.out.print("Enter your marks for subject " + i + " : ");
            marks = scan.nextDouble();

                if (marks > 100) {
                    System.out.println("Invalid marks.");
                    break;
                }

            total += marks;
        }

        average = total/5;
        System.out.println("Total marks you got : " + total);
        System.out.println("Average: " + average);

        if (average >= 90 && average <= 100) {
            System.out.println("Gread: A");
        } else if (average >= 75) {
            System.out.println("Gread: B");
        } else if (average >= 60) {
            System.out.println("Gread: C");
        }  else if (average < 60) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks.");
        }








        scan.close();
    }
    
}