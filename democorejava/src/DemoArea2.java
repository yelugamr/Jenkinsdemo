
public class DemoArea2 {
	
	
	 int ar =0;  // global
	
	public void getArea( int l,int b)  // l and b are local
	{
		// ar = l*b;  // assigning local value to global ar
		
		int ar = l*b; // local ar
		
		this.ar =ar; // assigning local ar value to global ar
		
		System.out.println("area is "+ar);
		
	}

	public void getParameter(int h)
	{
		//int param = l*b*h;
		//int param = ar*h;
		
		int param = ar*h;
		System.out.println("parameter is "+param);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DemoArea2 d = new DemoArea2();
d.getArea(12,4);
d.getParameter(5);
	}

}
