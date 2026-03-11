class Student {
	// attributes
	String name = "";
	int age;

	// behavior or method
	void showInfo(){
		System.out.println("My name is " + name + " and I'm " + age + " year old.");
	}
}

public class ClassRev {

	public static void main(String[] args) {
		Student s = new Student();
		s.showInfo();
	}
}