
public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n = "parag123@gmail.com";  // moreprefered
		
		// or
		
		//String n = new String("parag");  
		
		int val=n.length();  // predefined 
		System.out.println("length is "+val);
		
		for(int a=0;a<val;a++)
		{
		 char ch=n.charAt(a);
		 System.out.println(ch);
		}
		 String n1=n.toUpperCase();
		 System.out.println(n1);
		 
		 String x = "amit";
		 
		 // long way
		 /*
		 String y =  " Amit ";
		 String y1=y.trim();
		 String y2=y1.toLowerCase();
				 */
		 // short way
		 String y = " Amit ".trim().toLowerCase();
		 
		 if(x.equals(y) )
		 {
			 System.out.println("match");
		 }
		 else {
			 System.out.println("not match");
		 }
		 
		 String p = "pArAg";
		 char fch=p.charAt(0);
		char fch1=Character.toUpperCase(fch);
		
		String sub=p.substring(1);
		String sub1 = sub.toLowerCase();
		System.out.println(fch1+sub1);
		
		// short cit
		
		System.out.println(Character.toUpperCase(p.charAt(0))+p.substring(1).toLowerCase());
		
		 
	}

}
