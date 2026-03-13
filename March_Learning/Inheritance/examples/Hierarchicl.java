// Hierarchial inheritance means on parnet and multiple childs classes

// let's assume Animal is parent class and Dog and Cat are child classes

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat meow");
    }
}

public class Hierarchicl{
    public static void main(String[] args){
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.eat();
        d1.bark();

        c1.eat();
        c1.meow();

        // Here d1 and c1 are different methods and d1 method calls Dog class and c1 calss Cat class. Then d1 and
        // c1 are accessing Animal class varaibles also because they extends Animal class.

    }
}
