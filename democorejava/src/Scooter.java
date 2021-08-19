
public class Scooter implements Automobile {

	public void accelrate() {
		System.out.println("scooter accelrate by hand");
	}

	public void break1() {
		System.out.println("scooter stop by hand break");
	}

	public void air() {
		System.out.println("Planes stop by hydrolics");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scooter sc = new Scooter(); sc.accelrate(); sc.break1();
		 */
		// or
		Automobile auto = new Scooter(); // prefer
		auto.accelrate();
		auto.break1();
		auto.air();
	}

}
