class Student{
	// attributes
	String name;
	int rollNumber;
	double marks = 0.0;

	void CalculateGrade(){
		System.out.println("My name is: "+name);
		System.out.println("And my marks: " + marks);
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
}

public class Student_Record_System {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Manoj Mahata";
		s1.marks = 90;

		s1.CalculateGrade();
	}
}