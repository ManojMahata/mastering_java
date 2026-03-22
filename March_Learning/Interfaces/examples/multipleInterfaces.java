interface FirstInterface{
    public void myMethod();
}

interface SecondInterface{
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("Multiple..");
    }
    public void myOtherMethod(){
        System.out.println("Interface..");
    }
}

public class multipleInterfaces{
    public static void main(String[] args){
        DemoClass dc = new DemoClass();
        dc.myMethod();
        dc.myOtherMethod();
    }
}
