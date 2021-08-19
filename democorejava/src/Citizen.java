
public class Citizen {

	public void checkcitizenship(String pob, int stay)
	{
		if (pob=="india" || stay>11)
		{
			System.out.println("You are a Indian");
		}else 
		{
			System.out.println("You are not a Indian");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Citizen H=new Citizen();
		H.checkcitizenship("india", 8);
		
		
	}

}
