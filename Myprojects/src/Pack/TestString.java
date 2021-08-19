package Pack;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sc = new String("  Rakesh");

		int l = sc.length();
		char a = sc.charAt(0);
		String r = sc.toLowerCase();
		String f = sc.toUpperCase();
		String o = sc.trim();
		int i = sc.indexOf(6);

		System.err.println(l);
		System.out.println(a);
		System.out.println(r);
		System.out.println(f);
		System.out.println(o);
		System.out.println(i);

	}

}
