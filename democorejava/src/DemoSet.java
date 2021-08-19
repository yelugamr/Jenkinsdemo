import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s = new HashSet<Integer>(); // initialize

		s.add(12); // storing
		s.add(34);
		s.add(45);
		s.add(12);
		s.add(22);
		s.add(45);

		// retrive in random

		Iterator<Integer> it = s.iterator();

		while (it.hasNext()) {
			System.out.println("hashset" + it.next());
		}

		Set<Integer> s1 = new LinkedHashSet<Integer>(); // initialize
		s1.add(12); // storing
		s1.add(34);
		s1.add(45);
		s1.add(12);
		s1.add(22);
		s1.add(45);

		// retrive in random

		Iterator<Integer> it1 = s1.iterator();

		while (it1.hasNext()) {
			System.out.println("linked" + it1.next());
		}

		Set<Integer> s3 = new TreeSet<Integer>(); // initialize
		s3.add(12); // storing
		s3.add(34);
		s3.add(45);
		s3.add(12);
		s3.add(22);
		s3.add(45);

		// retrive in random

		Iterator<Integer> it3 = s3.iterator();

		while (it3.hasNext()) {
			System.out.println("Tree" + it3.next());
		}

	}

}
