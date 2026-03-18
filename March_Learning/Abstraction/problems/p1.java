abstract class Animal {
    public abstract void sound(); // abstract method cannot have body
}

class Lion extends Animal{

    public void sound() {
        System.out.println("Lion roar");
    }
}

class Tiger extends Lion {
    public void sound(){
        System.out.println("Tiger roar");
    }
}

public class p1{
    public static void main(String[] args){
        Animal a = new Tiger();
        a.sound();
        Animal b = new Lion();
        b.sound();
    }
}







