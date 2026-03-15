class Person{
    // attributes
    String name;
    int age;
    // constructor to initialize values
    Person(String n, int a){
        this.name = n;
        if(a > 0 && a < 200)
            this.age = a;
        else
            System.out.println("Invalid age");
    }// constructor closed

    // method to display name and age of the person
    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    } // method closed


}// Person class closed

class Student extends Person{
    // attributes
    String course;
    // add a constructor that calss super
    Student(String n, int a){
        super(n,a);
    }
    void displayStudent(){
        super.displayPerson();
        System.out.println("Course: " + course);
    } // method closed

}// Student class closed


// main class and method
public class Problemthree{
    public static void main(String[] args){

        // object to call Person constructor

        Student s1 = new Student("Manoj", 20);
        s1.course = "Java";
        s1.displayStudent();

    }// main method closed
}// main class closed
