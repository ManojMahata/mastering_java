class Student {
	int marks;
}

// this is third type of modifier which
public class Default_Modifier {

	public static void main(String[] args) {
		Student s = new Student();
		s.marks = 87;
		System.out.println("marks: " + s.marks);
	}
}