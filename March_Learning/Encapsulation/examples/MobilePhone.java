import java.util.Scanner;

class Mobile {
	// attributes in private
	private double BetteryLevel;
	// setter validation
	public void battery(double input){
		if ( input > 100 || input <= 0){
			System.out.println("Invalid battery level.");
		} else {
			this.BetteryLevel = input;
			System.out.println("Current Battery: " + BetteryLevel);
		}
	}
	// method to charge
	void Charge( double input) {
		this.BetteryLevel += input;
		System.out.println("Battery Level after charging: " + (BetteryLevel));
	}

	// method to use battery
	void useBattery(double input) {
			if (input > this.BetteryLevel) {
			System.out.println("Opps can't use this much batter "+ input + " Because current battery level is: " + this.BetteryLevel);
			} else if (input <= 0) {
			System.out.println("Invalid input can't use " + this.BetteryLevel + " O and less then 0 is invalid input.");
			} else {
		this.BetteryLevel-=input;
		System.out.println("Battery Used by User: " + input);
		System.out.println("Remaining Batter: " + BetteryLevel);
			}
	}
}
public class MobilePhone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// object to initilize values.
		Mobile m1 = new Mobile();
		System.out.print("Enter Current Battery Level: ");
		double currentBatteryLevel = scan.nextDouble();
		m1.battery(currentBatteryLevel);

		//  method to chare battery level
		System.out.print("Enter the percentage you want to add: ");
		double chargeBattery = scan.nextDouble();
		m1.Charge(chargeBattery);

		// call method to use battery
		System.out.print("Enter the percentage you want to charge: ");
		double withdraw = scan.nextInt();
		m1.useBattery(withdraw);


		scan.close();
	}
}