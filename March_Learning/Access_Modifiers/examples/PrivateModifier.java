class P{
	private int marks;

	public void setMarks( int m ){
		if ( m > 0 && m <= 100){
			this.marks = m;
		}
	}

	public int getMarks(){
		return marks;
	}
}

public class PrivateModifier {

	public static void main(String[] args) {
		P p1 = new P();
		// p1.makrs = 98; this is invalid because we can access private varibales directly of the othere class.
		p1.setMarks(98); // valid through setter method
		System.out.println("Marks: " + p1.getMarks());

		//

		}
}

