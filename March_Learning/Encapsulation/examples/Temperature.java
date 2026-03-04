class Temp {
	private double celsius;

	public void setCelsius(double celsius) {
		if ( celsius >= -273.15) { //absolute zero
			this.celsius = celsius;
		} else {
			System.out.println("Invalid temperature!!");
		}
	}

	public double getCelsius(){
			return celsius;
		}
}

public class Temperature {

	public static void main(String[] args) {
		Temp t = new Temp();
		t.setCelsius(2);
		System.out.println(t.getCelsius());
	}
}