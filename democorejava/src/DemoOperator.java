
public class DemoOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
		int x = 12;
		x++;
		
		System.out.println(x);
		
		//x= x+5;
		x+=5;
		System.out.println(x);
		
		System.out.println(x == 18);
		System.out.println(x != 18);
		*/
		String citizen = null;
		
		citizen = "indian";
		int x =12;
		
		
		int stay = 11;
		
		if(x >= 18 && citizen == "indian")
		{
			System.out.println("vote");
		}
		else if(x >= 18 && citizen != "nonindia" && stay >= 11)
		{
			System.out.println("vote as indian ");
		}
		else {
			System.out.println("cannot vote");
		}
		
		int exp = 2;
		String qlf = "MCA";
		
		if(exp >= 5 || qlf == "MCA" )
		{
			System.out.println("apply for job");
		}
		else {
			System.out.println("cannot apply for job");

		}
		
		int xx=0;
		
		while(xx <= 10)
		{
			xx++;
			System.out.println(2*xx);
		}
		
		for(int yy =0;yy <= 10;yy++)
		{
			System.out.println(3*yy);
		}
		
		
		 
		}
		
	}


