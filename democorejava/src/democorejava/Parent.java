package democorejava;

public class Parent {
	
	public int age = 23;
	
	
	
	public void parentmsg()
	{
		
		System.out.println("parent says hello");
	}
	// over load in same class
	public void parentmsg(String x)
	{
		System.out.println(x);
	}
	
	public void parentmsg(int x)
	{
		System.out.println(x);
	}
	
	public void calculate(int x,float y)
	{
		System.out.println(x+y);
	}
	
	public void calculate(float x,int y)
	{
		System.out.println(x*y);
	}
	

	private void privatemsg()
	{
		System.out.println("secrent msg");
	}
	
	public final void finalmsg()
	{
		System.out.println("final msg from parent");
	}
	
	public Parent()
	{
		System.out.println("parent default constructor");
	}
	
	public Parent(int c)
	{
		System.out.println("parent not default constructor");

	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		p.parentmsg();
		p.privatemsg();
		
		p.parentmsg(23);
		p.parentmsg("ram");
		
		p.calculate(12, 12F);
		p.calculate(21F, 2);
		
		Parent p1 = new Parent(6);  // constructor overload
	}

}
