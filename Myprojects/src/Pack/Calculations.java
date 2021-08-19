package Pack;

public class Calculations {

	public static void sum(int a, int b) {
		int c = a + b;
		System.out.println("THis is the value of the " + c);
	}

	public static void sub(int a, int b) {
		int c = a - b;
		System.out.println("THis is the value of the " + c);

	}

	public static void mul(int a, int b) {
		int c = a * b;
		System.out.println("THis is the value of the " + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculations d = new Calculations();
		d.sum(20, 25);

		d.sub(20, 25);
		d.mul(25, 20);

		// can we do like this without creating the object
		/*
		 * Calculations.sum(20, 25);
		 * 
		 * Calculations.sub(20, 25); Calculations.mul(25, 20);
		 */
	}

}
