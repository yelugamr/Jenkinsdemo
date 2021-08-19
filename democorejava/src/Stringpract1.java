import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stringpract1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//this to convert the sting from lower class to upper class and upper class to lover class.
		String a = "I love my countary ";
		String c = "I love my countary ";
		String b = a.toUpperCase(); // converting uppwer cla
		String b1 = c.toLowerCase();
		System.out.println(b);
		System.out.println(b1);

		// this to read data from user and trim .Converting the int to string

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name ");
		String x = br.readLine();
		// String i=x.trim();
		int i1 = Integer.parseInt(x);
//int i=Integer.parseInt(br.readLine().trim());
//This is to read data and forward to out put
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name ");
		String x1 = br1.readLine();
//String j=x1.trim();
		int j1 = Integer.parseInt(x1);
//int j=Integer.parseInt(br1.readLine().trim());

		int v = i1 + j1;

		System.out.println(v);

	}

}
