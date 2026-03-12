// Student class
class Student{

	// Attributes with encapsulation
	private String name;
	private double marks;
	private String grade;

	// setter to set name and marks with validation
	public void setMarks(String n, double m){

		if (m >= 0 && m <= 100){
			this.name = n;
			this.marks = m;
	} else {
		System.out.println("Invalid Marks");
		return;	
		}
	}// setter closed
	
	// getter for name
	// public String getName(){
	// 	return name;
	// } // getter for name is closed
	
	// getter for marks
	// public double getMarks(){
	// 	return marks;
	// }// getter for marks closed
	
	// method to calculate grade
	public void claculateGrade(){

		if ( marks >= 90)
			grade = "A";
		else if (marks >= 70)
			grade = "B";
		else if ( marks >= 50 ) 
			grade = "C";
		else if( marks >= 38)
			grade = "D";
		else
			grade = "F";
	}// method to calculate garted method closed

	// method to display result
	public void showResult(){
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);
	} //showResult method closed

}

// main class
public class Correct_Student_Result_System {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setMarks("Manoj", 98);
		s1.claculateGrade();
		s1.showResult();
	}
}

// When getters become necessary
// suppose main() tries this: print(s1.name); here Java will give error. Because name has private access in Student class, therefore: use getMarks or other method to access the value of private variable from other class or in main method.
