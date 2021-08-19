import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Username {
	
	
	public Username(String uswer, int pwd)
	{
		if(uswer=="amit" && pwd==12345)
		{
			System.out.println("He is a member of the organisation");
		}else
		{
			System.out.println("He is not a member ");
		}
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enetr name");
		
		String Username = br.readLine().trim();
		
	System.out.println("Entered Name is  " +Username);
	

	}

}
