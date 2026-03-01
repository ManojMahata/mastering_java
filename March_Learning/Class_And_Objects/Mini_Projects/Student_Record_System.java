class Student{
	// attributes
	String name;
	int rollNumber;
	double marks;

	void CalculateGrade(){
		if (marks > 100 || marks < 0)
			System.out.println("Invalid Marks.");
		else if ( marks >= 80)
			System.out.println("Gread: A");
		else if( marks >= 60)
			System.out.println("Gread: B");
		else if( marks >= 40)
			System.out.println("Gread: C");
		else
			System.out.println("Fail");
	}

	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Roll: " + rollNumber);
		System.out.println("Marks: " + marks);
	}
}

public class Student_Record_System {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Manoj Mahata";
		s1.rollNumber = 14;
		s1.marks = 90;

		s1.displayInfo();
		s1.CalculateGrade();
	}
}