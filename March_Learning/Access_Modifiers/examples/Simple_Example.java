class Example {

	// attribute and encapsulation
	private int a = 10; // modifiere that only accessed in existing class
	int b = 20; // default modifier accessed by package
	protected int c = 30; // can be accessed by package and sub classes
	public int d = 40; // public modifier can be accessed form anywhere
	
	public void showValues(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}// showValues method closed;
}// Example class closed

// main class

public class Simple_Example {

    public static void main(String[] args) {

        Example e = new Example();

        // e.a ❌ not allowed
        System.out.println(e.b);
        System.out.println(e.c);
        System.out.println(e.d);

    }
}
