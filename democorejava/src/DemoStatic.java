
public class DemoStatic {
	
	
	int x =12;
	
	static int y = 13;
	
	public static void abc()
	{
		System.out.println("i am static method");
		//System.out.println(x);
		System.out.println(y);	
	}
	
	public void xyz()
	{
		System.out.println("i am nonstatic method");
		System.out.println(x);
		System.out.println(y);	
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
	//System.out.println(x);
		System.out.println(y);	
		
		abc();
	//	xyz();
		
		DemoStatic d = new DemoStatic();
		System.out.println("AA "+d.x);
		d.x = 34;
		System.out.println("AA "+d.x);
		
		d.y = 100; // static
		
		DemoStatic d1 = new DemoStatic();
		System.out.println("BB "+d1.x);
		System.out.println("BB "+d1.y);
		
		
		d.xyz();
	
	}

}
