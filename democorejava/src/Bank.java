
public class Bank {
	
	static int bal =0;
	
	public void deposit(int amt)
	{
		bal+=amt;
	}
	
	public void widhraw(int amt)
	{
		bal-=amt;
	}
	
	public void showbal()
	{
		System.out.println("balance is "+bal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank online = new Bank();
online.deposit(1000);
online.widhraw(200);
online.showbal();

Bank offline = new Bank();
offline.deposit(500);
offline.widhraw(100);
offline.showbal();
	}

}
