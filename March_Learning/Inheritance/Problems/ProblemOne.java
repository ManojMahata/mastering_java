class Person {
    String name;
    int age;

    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    } // displayPerson method closed;

}// Parent class closed

class Student extends Person{
    int rollNumber;
    void displayStudent() {
    System.out.println("Roll no.: " + rollNumber);
    }
} // Student class closed

public class ProblemOne{
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Manoj";
        s1.age = 21;
        s1.rollNumber = 14;

        s1.displayPerson();
        s1.displayStudent();
    }
}












