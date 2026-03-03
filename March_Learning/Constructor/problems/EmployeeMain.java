class Employee {
// attributes
	int id;
	double salary;

	// constructor
	Employee(int a, double b){
		id = a;
		salary = b;
	}
	// method to print annual salary
	void methodOfannualSalary(){
		System.out.println("Id: " + id);
		System.out.println("Salary: " + salary);
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
	Employee emp = new Employee(1, 9800);
	emp.methodOfannualSalary();
	}
}