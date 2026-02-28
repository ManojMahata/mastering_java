class Student {
	// attributes
	String name;
	int age;
	String grade;

	// methods
	void intoduction(){
		System.out.println("Hi, I'm " + name + ", I'm " + age + " years old and my grade is " + grade);
	}
}

public class StudentInfo{
	public static void main(String[] args) {
		Student s1 = new Student();// object 1
		s1.name = "Manoj";
		s1.age = 21;
		s1.grade = "A+";

		Student s2 = new Student();// object 2
		s2.name = "Rasbin";
		s2.age = 20;
		s2.grade = "A++";

		s1.intoduction();
		s2.intoduction();
	}
}