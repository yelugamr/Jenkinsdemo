package Pack;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter Gender");
		char Gender = sc.next().charAt(0);
		System.out.println("Enter mobile");
		long mobile = sc.nextLong();

		System.out.println(name);

		System.out.println(age);

		System.out.println(Gender);

		System.out.println(mobile);

	}
}