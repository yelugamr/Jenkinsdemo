
public class Assignment1 {

	// user defined method - perform some action on variable argument
	public void chknumber(int x) // defined method in class
	{
		int numb = x % 2;
		if (numb == 0)

		{
			System.out.println("This is a EVEN number ");
		} else {
			System.out.println("This is a ODD number ");
		}

	}

	public static void main(String[] args) {
		Assignment1 ob = new Assignment1(); // calling default constructor - create memory space - return ref var

		ob.chknumber(124); // calling method
	}
}
