
public class DemoArea1 {
	
	
	public int getArea(int l,int b)  // l and b are local
	{
		int ar = l*b;  // ar is local
		System.out.println("area is "+ar);
		return ar;
	}

	public void getParameter(int h,int area)
	{
		//int param = l*b*h;
		//int param = ar*h;
		
		int param = area*h;
		System.out.println("parameter is "+param);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DemoArea1 d = new DemoArea1();
int res = d.getArea(12,4);

d.getParameter(5, res);

	}

}
