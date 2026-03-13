class Person{
    protected String name;
    void displayName(){
        System.out.println("Name: " + name);
    }
}

class Employee extends Person{
    protected double salary;
    void displaySalary(){
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee{
    protected String department;
    void displayManagerDetails(){
        System.out.println("Department: " + department);
    }
}

public class Problem_Three{
    public static void main(String[] args){
        Manager m1 = new Manager();

        m1.name = "Manoj";
        m1.salary = 0;
        m1.department = "DS";

        m1.displayName();
        m1.displaySalary();
        m1.displayManagerDetails();
    }
}
