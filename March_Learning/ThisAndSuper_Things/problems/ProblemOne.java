class Student{
    // attributes
    protected String name;
    protected int marks;
    protected int rollNumber;

    // Constructor to get input from object
    Student(String n, int m, int r){
        this.name = n;
        if ( m >= 0 && m <=100 )
            this.marks = m;
        else
            System.out.println("Invalid marks: " + marks);
        this.rollNumber = r;

    } // Student Constructor

    //method to displayStudent
    void displayStudent(){
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

}
    // Student Class closed


// main class and main method
public class ProblemOne{
    public static void main(String[] args){
        // object to call Student constructor
        Student s1 = new Student("Manoj", 99, 14);
        Student s2 = new Student("Rasbim", 100, 15);

        s1.displayStudent(); // method that displays values entered inside the Student Constructor

        s2.displayStudent();
    }// main mehtod closed
}// main class closed

