import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map<Integer, String> m = new HashMap<Integer, String>();

		// Map<Integer, String> m = new LinkedHashMap<Integer, String>();

		Map<Integer, String> m = new TreeMap<Integer, String>();

		m.put(1, "zen");
		m.put(2, "amit");
		m.put(4, "parag");
		m.put(3, "piyush");
		m.put(5, "amit");

		Collection<String> c = m.values();
		Iterator<String> itr = c.iterator();
		while (itr.hasNext()) {
			String ob1 = itr.next();
			System.out.println("val : " + ob1);
		}

	}

}
