
public class Salery1 {

	int gross = 0;
	static int gdeduction = 0;

	public void grosssalery(int basic, int hra)

	{
		gross = basic + hra;
		System.out.println("The total grosssalery is " + gross);

	}

	public void grossdeduction(int loan, int tax) throws InterruptedException {
		gdeduction = loan + tax;
		System.out.println("The total deduction is " + gdeduction);
		Thread.sleep(5000);
	}

	public void inhandsalery() {
		int gsalery = gross - gdeduction;
		System.out.println("The total gross salery is " + gsalery);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Salery1 sc = new Salery1();
		sc.grosssalery(12000, 5000);

		sc.grossdeduction(2000, 500);

		sc.inhandsalery();

	}

}
