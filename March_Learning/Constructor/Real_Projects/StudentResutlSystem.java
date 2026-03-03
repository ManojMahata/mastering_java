public class StudentResutlSystem {

	public static void main(String[] args) {
		Student s1 = new Student("Manoj", 14, 98);
		s1.calculateGrade();
		s1.showResult();
	}
}

class Student{
	// attributes
	String name;
	int roll;
	double marks;
	String grade;
	// constructor
	Student(String a, int b, double c){
		name = a;
		roll = b;
		marks = c;
	}
	// method to calculate grade
	void calculateGrade(){
		if ( marks <= 0 || marks > 100)
			grade =  "Invalid Marks.";
		 else if ( marks >= 90)
		 	grade = "A";
		else if (marks > 70)
			grade = "B";
		else if(marks >= 60)
			grade = "C";
		else if(marks >= 50)
			grade = "D";
		else
			grade = "Fail";
	}

	void showResult(){
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + roll);
		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);
	}

}