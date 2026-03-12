class Mobile {
	private int battery;
	private String brand;

	public void setBattery(int n){
		if (n > 0 && n <=100 ) {
		this.battery = n;
		this.brand = "Nothing";
		} else {
			System.out.println("Invalid battery percentage");
		}
	}

	public int getBatter(){
		return battery;
	}

	public void showMobileInfo(){
		System.out.println("Battery Percentage: " + battery);
		System.out.println("Mobile Barand:  " + brand);
	}
}

	public class Practice{
		public static void main(String[] args){
			Mobile m = new Mobile();
			m.setBattery(98);;
			m.showMobileInfo();
		}
	}
