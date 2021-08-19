
public class Counter {
	
	//int count =0; // global instance member
	
	static int count =0; // global class member
	
	public Counter()
	{
		count++;
		System.out.println("visit no "+count);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c1 = new Counter();
		
		Counter c2 = new Counter();
		
		Counter c3 = new Counter();
	}

}
