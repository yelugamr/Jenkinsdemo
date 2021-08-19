
public class DemoException2 {

	public void calculate(int i, int j) {
		System.out.println(i + j);
		try {
			System.out.println(i / j);
		} catch (Exception e) {
			// System.err.println("my error msg ");
			// e.printStackTrace();

			// alternate code - optional
			// System.out.println(i / 1);

		} finally {
			System.out.println(i * j);

			System.out.println(i - j);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoException2 d = new DemoException2();
		d.calculate(12, 0);
	}

}
