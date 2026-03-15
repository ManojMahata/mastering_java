// run time polymorphism

// this happens when parent class method are changed by the child class methods

class Animal {
    void sound(){
        System.out.println("Animal class");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("Dog class");
    }
}

public class exampleOne {
    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
    }
}


