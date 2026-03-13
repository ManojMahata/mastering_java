//Single Inheritance: This means one parent and cone child class

class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}// animial class closed

// now child class
class Dog extends Animal{

    void bark(){
        System.out.println("Dog is barking");
    }
    // Dog class closed
}

// main class

public class SingleInheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat(); // inherited methods
        d.bark();
    }
}

// Here actually Dog class is accessing the methods of Animal class.
