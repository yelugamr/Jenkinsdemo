package Pack;

import java.util.StringTokenizer;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String h = "This is total lengh of the string ";
		System.out.println(h.length());

// string length
		String a = "My name is rakesh";
		int c = a.length();
		System.out.println("The length of the string" + "  " + c);

// string toUpperCase
		String d = a.toUpperCase();
		System.out.println(d);

// concat
		String first = "This is the first statement";
		String Second = "This is the secound statement";

		String join = first.concat(Second);
		System.out.println("This is the combination" + "  " + join);

// compare two strings

		String first1 = "Myself rakesh";
		String Secound1 = "Myself rakesh";
		String Third = "My self rajesh";

		boolean result = first1.equalsIgnoreCase(Secound1);
		System.out.println(result);

		boolean result2 = Secound1.equalsIgnoreCase(Third);
		System.out.println(result2);

		System.out.println(Third.isEmpty());

// contains method

		if (Third.contains("self")) {
			System.out.println("Yes it contains ");
		} else {
			System.out.println("No it wont contains ");
		}
// Replace method
		String Third3 = Third.replace("self", "Rahul");
		System.out.println(Third3);

// Seperate the strings
		StringTokenizer st = new StringTokenizer("My name is done");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

//chatat

	}

}
