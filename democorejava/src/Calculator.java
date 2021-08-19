//import java.io.*;
import java.util.*;
public class Calculator {
	
	public void docalculation(int a ,int b ,String op)
	{
		if (op.equals("+"))
		{
			System.out.println(a+b);
		}
		else if  (op.equals("-"))
		{
			System.out.println(a-b);
		}
		else if(op.equals("*"))
		{
			System.out.println(a*b);
		}
		else if (op.equals("/"))
		{
			System.out.println(a/b);
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter any number");
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);

System.out.println("enter any operator");

String o = sc.nextLine();

System.out.println("enter any number");
int n1=sc.nextInt();
System.out.println("enter any number");
int n2 =sc.nextInt();



Calculator c = new Calculator();
c.docalculation(n1, n2, o);

	}

}
