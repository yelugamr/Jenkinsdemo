import java.io.*;
// first line of program
// import java.lang.*;  // default imported

public class Profile {

	
	
	public void  name(String x)
	{
		System.out.println("Name Entered is " +x);
	}
	
	public void age(int y)
	{
		System.out.println("Age of the person is" +y);
	}
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enetr name");
		
		String name = br.readLine().trim(); // taking user input
		
		System.out.println("enter age");
		
		//String age=br.readLine().trim();
		
		// convert String to int
		
		//int g = age;
		//int g1 = (int)age;
		//int age1 = Integer.parseInt(age);
		
		int age = Integer.parseInt(br.readLine().trim());  // short cut
		//byte age2 = Byte.parseByte(age);
		
		// TODO Auto-generated method stub
  Profile rakesh=new Profile();
  rakesh.age(age);
  rakesh.name(name);
  
	}

}
