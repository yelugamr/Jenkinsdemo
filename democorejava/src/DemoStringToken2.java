import java.util.Scanner;
import java.util.StringTokenizer;

public class DemoStringToken2 {

	public void msg(String xyz) {
		StringTokenizer str = new StringTokenizer(xyz, " ");

		while (str.hasMoreTokens()) {
			String word = str.nextToken().trim(); // break word from line
			System.out.print(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter line msg");
		String l = sc.nextLine();

		DemoStringToken2 t = new DemoStringToken2();
		t.msg(l);
	}

}
