class Student {
	// attributes
	String name = "";
	int age;

	// constructor
	Student (String name, int age){
		this.name = name;
		this.age = age;
	}

	// behavior or method
	void showInfo(){
		System.out.println("My name is " + name + " and I'm " + age + " year old.");
	}
}

public class ClassRev {

	public static void main(String[] args) {
		Student s = new Student(); // object is created to run/initialize values in class/blueprint.

		s.showInfo();
	}
}