import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<String>();

		l.add("sam");
		l.add("kp");
		l.add("nisha");
		l.add("sam");
		l.add("amit");

		Iterator<String> i = l.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
