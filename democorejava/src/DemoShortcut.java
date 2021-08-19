
public class DemoShortcut {

	public String getName(String x) {
		return x; // last line of method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// long way
		/*
		 * DemoShortcut d = new DemoShortcut();
		 * 
		 * String val=d.getName("rakesh"); String val1 = val.toUpperCase();
		 * System.out.println(val1);
		 */
		// short way
		System.out.println(new DemoShortcut().getName("rakesh").toUpperCase());

	}

}
