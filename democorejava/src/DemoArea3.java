
public class DemoArea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		DemoArea1 d = new DemoArea1();  // i can call one class from another in same package
		int res = d.getArea(12,4);
		
		System.out.println("price of paint is 3 rs sq ft : "+res*3);
		*/
		
		DemoArea2 d = new DemoArea2();
		d.getArea(12,4);
	System.out.println("price of paint is 3 rs sq ft : ");

	}

}
