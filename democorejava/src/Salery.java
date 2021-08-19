
public class Salery {

	public int grosssalery(int basic, int hra)

	{
		int gross = basic + hra;
		System.out.println("The total grosssalery is " + gross);
		return gross;
	}

	public int grossdeduction(int loan, int tax) {
		int gdeduction = loan + tax;
		System.out.println("The total deduction is " + gdeduction);
		return gdeduction;
	}

	public void inhandsalery(int gross, int gdeduction) {
		int gsalery = gross - gdeduction;
		System.out.println("The total gross salery is " + gsalery);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salery sc = new Salery();
		int g = sc.grosssalery(12000, 5000);

		int d = sc.grossdeduction(2000, 500);

		sc.inhandsalery(g, d);

	}

}
