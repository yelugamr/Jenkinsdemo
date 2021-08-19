package Pack;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20;
		int t;
		t = a;
		a = b;
		b = t;

		System.out.println("The value of the a is " + a);
		System.out.println("The value of b is " + b);

		// with out using third variable
		int c = 10, e = 20;
		c = c + e;
		c = e - c;
		c = c - e;
		System.out.println("The value of the a is " + c);
		System.out.println("The value of b is " + c);
	}

}
