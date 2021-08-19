
public class Demodatatype2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implicit - upcasting
		
				byte x = 120; // 120 is of byte type
				
				// x= x+10;
				
				// convert byte to int
				
				int y = x; // 120 is of int type
				
				//4 byte = 1 byte
				
				y=y+100; // adding 100 to y
				
				System.out.println(y);
				
				// explicit - downcasting
				
				int age = 32;
				
				byte age2 = (byte)age;
				
				System.out.println("converted no data loss "+age2);
				
				int a = 130;
				
				byte bb = (byte)a;
				
				System.out.println("data loss "+bb);
				
				long v = 45L;
				//or
				long v1 = 45; // 45 as int type and implicit type cast to long
				
				double dd = 34.67D;
				//or
				double dd1 = 34.67; // double is default
				
				float ff = 44.55F; // compulsory to suffix F with float
				//or
				float ff1 =(float) 44.55;
				
				
				
				
				
	}

}
