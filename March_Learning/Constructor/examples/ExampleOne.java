// class
class Student {
	// attributes
	String name;
	int age;

	// constructor
	Student (String n, int a){
		name = n;
		age = a;
	}

	// method to display information
	void displayInfoMethod(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class ExampleOne {

	public static void main(String[] args) {
		// student object and calling the constructor..

		Student s1 = new Student("Manoj", 21);
		s1.displayInfoMethod();
	}
}