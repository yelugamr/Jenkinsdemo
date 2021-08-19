package democorejava;

public class Child extends Parent {
	
	
	public void childmsg()
	{
		System.out.println("child says hello");
	}
	
	// over load in child
	
	public void parentmsg(String x,int y)
	{
		System.out.println("name "+x+ "age "+y );
	}
	// over ride - redefining old available method of parent
	
	public void parentmsg()
	{
	System.out.println("child changed parent method");	
	}
	
	// final method cannot be overridden
	/*
	public void finalmsg()
	{
		System.out.println("changing final method");
	}
	*/
	public Child()
	{
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c = new Child();
c.childmsg();

c.parentmsg();

//c.privatemsg();

//c.add();

System.out.println(c.age);  // global variables are also inherited

c.finalmsg();  // final method can be inherited.

c.parentmsg("sita");  // inherited
c.parentmsg(34);

c.parentmsg("tom", 54); // overload in child

	}

}
