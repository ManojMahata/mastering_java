import java.util.Scanner;

public class StuentResultSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ResultClass r1 = new ResultClass();
		System.out.print("Enter your marks: ");
		double marks = scan.nextDouble();
		r1.Marks(marks);
		r1.calculateGrade();

		scan.close();
	}// main method closed
}// main class closed

// class to calculate student marks and grade
class ResultClass {

	// attributes and encapsulation
	private double marks;

	public void Marks (double enteredMarsk){
		if (enteredMarsk > 100 || enteredMarsk < 0)
			System.out.println("Invalid marks, no on gets: " + enteredMarsk + " marks.");
		else
			this.marks = enteredMarsk;
	}// marks method closed

	// method to calcualte grade:
	void calculateGrade(){
		String grade;
		if (marks >= 90)
			grade = "A";
		else if (marks >= 70)
			grade = "B";
		else if(marks >= 50)
			grade = "C";
		else if(marks >= 40)
			grade = "D";
		else
			grade = "Opps! you failed in exam.";

		System.out.println("According to enterd marks: " + marks + " , Your Grade is: " + grade);
	}

}// ResultClass class closed