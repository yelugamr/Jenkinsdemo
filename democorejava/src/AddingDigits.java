import java.io.*;

public class AddingDigits {
	
	public void doAddition(int number)
	{
		String x = Integer.toString(number); // convert int to String
		
		int size = x.length(); // get String size
		int sum =0;
		for(int i=0;i < size; i++)
		{
			char ch = x.charAt(i); // break digits
			//int digit =(int)ch;
			int digit=Character.getNumericValue(ch);
			System.out.println(digit);
			
			sum = digit+sum;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter any number");

int num = Integer.parseInt(br.readLine().trim());
AddingDigits a = new AddingDigits();
a.doAddition(num);
	}

}
