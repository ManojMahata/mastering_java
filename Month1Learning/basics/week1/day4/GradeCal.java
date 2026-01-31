import  java.util.*;

public class GradeCal {
    public static void main(String[] args){

//Scanner class
Scanner scan = new Scanner(System.in);  
// we need total marks of student
// (total marks/full marks) * 100;
// Let's get input from student;
double fullMarks = 500; // total marks of whole subject.
System.out.print("Enter the total marks you got: ");
double marks = scan.nextDouble();

double grade = (marks/fullMarks)*100;

System.out.print("Grade you got is: "+ grade+"\n");

// now if else if statement to give student grade


scan.close();
    }
}
