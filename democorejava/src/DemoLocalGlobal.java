
public class DemoLocalGlobal {
	
	String msg = null;
	
	public void abc()
	{
		int x=20; // global for if{} and else{} but local for abc(){}
		
		
		if(x <= 10)
		{
			 msg = "your age is less than 10 it is "+x;  // local
			
		}
		else {
			 msg ="your age is above 10 it is "+x;
			}
		
		System.out.println(msg);
	}

	public void xyz()
	{
		System.out.println(msg);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoLocalGlobal d = new DemoLocalGlobal();
		d.abc();
		d.xyz();
		
}
	
}
