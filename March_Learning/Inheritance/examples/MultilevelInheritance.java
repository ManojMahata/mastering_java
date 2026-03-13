// chain of inheritance
// sturctuer : grandparent -> parent -> child

// here child can use parent and grandparent boths methods

class Animal{

    void eat(){
        System.out.println("Animal eats food");
    }
    // Animal class closed || Grandparent class closed
}

class Dog extends Animal{

    void bark(){
        System.out.println("Dog barks");
    }
} // Dog class closed || Parent class closed

// Child class

class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy weeps");
    }
    // Puppy||Child class closed
}

// now we can actually access eat and bark methods of Animal and Dog class by using Puppy class objects only

// main class
public class MultilevelInheritance{
    public static void main(String[] args){
        Puppy p1 = new Puppy();

        p1.eat();
        p1.bark();
        p1.weep();
    }
}
