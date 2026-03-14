class Animal {
       void eat(){
           System.out.println("Animal eats food");
       }
       // animal class closed
   }

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.print("Cat meows");
    }
}

public class Hproblem{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
