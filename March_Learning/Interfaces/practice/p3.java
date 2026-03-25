interface Flyable{
	void fly_obj(); // interface method
}

class Spacecraft implements Flyable{
	public void fly_obj(){
		System.err.println("Spacecraft is used to go on space.");
	}
}

class Airplane implements Flyable{
	public void fly_obj(){
		System.err.println("Airplance is known as commercial ari transportation.");
	}
}

class Helicopter implements Flyable{
	public void fly_obj(){
		System.out.println("Helicoper often are private.");
	}
}

public class p3 {

	public static void main(String[] args) {
		Flyable s = new Spacecraft();
		s.fly_obj();

		Flyable a = new Airplane();
		a.fly_obj();

		Flyable h = new Helicopter();
		h.fly_obj();
	}
}