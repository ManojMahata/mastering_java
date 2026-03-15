// program to illustrate super keyword
// refers super-class instance
class Parent {
	// instance variable
	int a = 10;

	// static variable
	static int b  = 30;

}

class Base extends Parent{
	void rr(){
		System.out.println(super.a);

		System.out.println(super.b);
	}

}


// main class
public class example {

	public static void main(String[] args) {
		new Base().rr();
	}
}