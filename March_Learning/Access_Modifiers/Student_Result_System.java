//Student class
class Student{
	// attributes and encapsulation
	private String name;
	private double marks;
	private String grade;

	// setter to set marks and validation to varaibales
	public void setMarsk(String n, double m){
		if (m > 0 && m <= 100){
			this.marks = m;
			this.name = n;
		}
		else {
			System.out.println("Invaid Marks");
			return;
		}
	} // setter closed

	// getter to get name
	public String getName(){
		return name;
	}  // getter closed

	// getter to display or return marks
	public double getMarks(){
		return marks;
	}// getter closed

	// method to calculate grade
	public void calculateGrade(){

		if (marks >= 90 && marks <= 100)
			grade = "A";
		else if (marks >= 70 && marks < 90)
			grade = "B";
		else if (marks >= 50 && marks < 70)
			grade = "C";
		else if (marks >= 38 && marks < 50)
			grade = "D";
		else
			System.out.println("You failed kid.😭");
	} // grade calcualtor method closed

	public void showResult(){
		System.out.println("Name: " + name + " Marks: " + marks + " and Grade is: " + grade);
	}

}
//Student class closed

// main class and main method
public class Student_Result_System {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setMarsk("Manoj", 90);
		s1.calculateGrade();
		s1.showResult();
	}
}
