import java.util.StringTokenizer;

public class DemoStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "parag, amit, piyus, Sita, geeta, meeta radha roli";

		StringTokenizer str = new StringTokenizer(text, ",. ");

		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken().toUpperCase());
		}

		System.out.println();
	}

}
