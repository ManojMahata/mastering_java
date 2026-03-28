class Student{
	public int roll_no;
	public String name;

	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
}

public class ArraysofObject {

	public static void main(String[] args) {
		// Declare an array of student
		Student[] arr;
		// allocating memory for 5 objects of type student.
		arr = new Student[3];
		// initialize the elements of the array
		arr[0] = new Student(1, "Manoj");
		arr[1] = new Student(2, "Manoj Mahata");
		arr[2] = new Student(3, "Balen Saha");

		// accessing the elements of the specified
		for ( int i = 0; i < arr.length; i++ )
			System.out.println("Elements at " + i + " : { " + arr[i].roll_no + " " + arr[i].name + " }");

		System.out.println(arr[4]);


	}
}