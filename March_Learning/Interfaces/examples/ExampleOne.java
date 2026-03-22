// Interface
interface Animal{
    public void animalSound(); // interface method (does not have body}
    public void sleep(); // interface method dosen't have body.
}

class Pig implements Animal {
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}

public class ExampleOne{
    public static void main(String[] args){
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();

    }
}



