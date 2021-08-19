package democorejava;

public class GrandChild extends Child
{
	
	
	public void grandchildmsg()
	{
		System.out.println("grandchild says hello");
	}

	public GrandChild()
	{
		System.out.println("grandchild constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GrandChild g = new GrandChild();
g.grandchildmsg();
g.parentmsg();
g.childmsg();
	}

}
