
public class DemoException1 {

	public void calculate(int i, int j) throws Exception {
		System.out.println(i + j);

		System.out.println(i / j);

		System.out.println(i * j);

		System.out.println(j - j);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DemoException1 d = new DemoException1();

		d.calculate(12, 0);
	}

}
