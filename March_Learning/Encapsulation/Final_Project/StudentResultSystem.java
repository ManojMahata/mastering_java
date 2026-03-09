import java.util.Scanner;
class Student{
	//Ecapsulation: private variables
	private String name;
	private int roll;
	private int marks;

	// Setter for student name
	public void setName(String n){
		name = n;
	}

	// Setter for roll number
	public void setRoll(int r){
		roll = r;
	}
	
	// Setter for marks with validation
	public void setMarks(int m){

	// marks must be between 0 and 100
	if (m >= 0 && m <= 100){
		marks = m;
	} else {
		System.out.println("Invalid marks. Must be 0-100.");
		return;
	}
}

	// Getter methods
	public String getName(){
		return name;
	}

	public int getRoll(){
		return roll;
	}

	public int getMarks(){
		return marks;
	}

	// Method to calculate grade
	public String calcualteGrade(){

		if (marks >= 80 && marks <= 100)
			return "A";
		else if (marks >= 60)
			return "B";
		else if (marks >= 40)
			return "C";
		else 
			return "Fail";
	}

} // Student class closed

// Account class starts
class AccountSection{
	// private fee balance
	private double feeBalance = 5000; // student's fee pay

	// method to pay fee
	public void payFee(double amount) {

		if (amount > 0 && amount <= feeBalance) {
			feeBalance -= amount;
			System.out.println("Fee paid: " + amount);
		} else {
			System.out.println("Ivalid payment.");
			return;
		}
	}

	// check remaining fee
	public void checkDue() {
		System.out.println("Remaining Fee: " + feeBalance);
	}
}// Account class closed

// Admin class
class Admin {
	// update student marks
	public void updateMarks( Student s, int newMarks ) {
		s.setMarks(newMarks);
		System.out.println("Marks Updated.");
	} // updateMarks method closed

	// view student result
	public void viewResult(Student s) {
		System.out.println("\n--- Student Resutl ---");
		System.out.println("Name: " + s.getName());
		System.out.println("Roll: " + s.getRoll());
		System.out.println("Marks: " + s.getMarks());
		System.out.println("Grade: " + s.calcualteGrade());

	}// viewResult method closed
} // admin close

// Main Class & Main Method
public class StudentResultSystem{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	Student s1 = new Student();
	AccountSection acc = new AccountSection();
	Admin admin = new Admin();

	// student basic details inputs
	System.out.print("Enter Student Name: ");
	s1.setName(scan.nextLine());

	System.out.print("Enter Roll Number: ");
	s1.setRoll(scan.nextInt());

	int choice;

	do {
		System.out.println("\n ===== College Management Menu =====");
		System.out.println("1. Update Marks (Admin)");
		System.out.println("2. View Result");
		System.out.println("3. Pay Fee");
		System.out.println("4. Check Fee Due");
		System.out.println("5. Exit");

		System.out.print("Enter Choice: ");
		choice = scan.nextInt();

		switch (choice) {

		case 1:
			System.out.print("Enter new marks: ");
			int marks = scan.nextInt();
			admin.updateMarks(s1, marks);
			break;

		case 2:
			admin.viewResult(s1);
			break;

		case 3:
			System.out.print("Enter paying amount: ");
			double payingFee = scan.nextDouble();
			acc.payFee(payingFee);
			break;

		case 4:
			acc.checkDue();
			break;

		default:
			System.out.println("Invalid choice!!!");
			break;
		}

	} while(choice != 5);



	scan.close();
	}// Main method closed
}// Main class closed
