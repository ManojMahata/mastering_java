class Animal{
    void eat(){
        System.out.println("Animal is eating");
    } // eat method closed
} // animal class closed and this is our parent class

class Dog extends Animal {
    void bark(){
        System.out.println("dog is barking");
    }
}

// main class
public class BasicExample{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

/*
 * here dof inherits the eat() method from animal class
 * so the object d can use: eat() from parent class
 * and bark() from child class
 *
 * :. We use inheritance for code reusablility
 *
 * */
