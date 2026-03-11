class Students {
	// attributes and encapsulation
	private int makrs;

	// setter method
	public void setMarks(int m){
		if (m > 0 && m <= 100){
			this.makrs = m;
		}
	}

	// getter methods
	public int getMarks(){
		return makrs;
	}
}// student class closed

public class getSet {

	public static void main(String[] args) {
		Students s = new Students(); // object of students class
		s.setMarks(98); // initialized value in setter method
		System.out.println("Marks: " + s.getMarks());

	}
}