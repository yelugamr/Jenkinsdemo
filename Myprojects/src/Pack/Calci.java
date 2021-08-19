package Pack;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int n1 = sc.nextInt();
		System.out.println("Enter the secound number ");
		int n2 = sc.nextInt();
		System.out.println("Enter the operation(+,-,*,/)");
		String sym = sc.next();
		int res = 0;
		switch (sym) {
		case "+":
			res = n1 + n2;
			System.out.println("Addition of 2 numbers" + res);
			break;
		case "-":
			res = n1 - n2;
			System.out.println("Subractioin of 2 numbers" + res);
			break;
		case "*":
			res = n1 * n2;
			System.out.println("Multiplication of 2 number " + res);
			break;
		case "/":
			System.out.println("Divison of 2 numbers " + res);
			break;

		}

	}

}
