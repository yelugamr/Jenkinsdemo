public class Test
{
	
	// userdefined methods - belong to class - not called automatically
	
	// default constructor - not need to define
	/*
	public Test()
	{
		// empty
	} */
	
	public  void sum(int i,int j)
	{
	
		System.out.println(i+j);
		
		
	}
	
	public void subs(int i,int j)
	{
		System.out.println(i-j);

	}
	
	public void multi(int i,int j)
	{
		System.out.println(i*j);
	}
	
	public void divide(int i,int j)
	{
		System.out.println(i/j);
		
	}
	
	
// predefined method - does not belong to class-called at runtime automatically by jvm
public static void main(String[] args)
{
	Test t= new Test(); // calling default constructor will create memory space
	


t.sum(12,67);  // calling method
t.multi(56,4);
//int i = 12;

//type variable = data;

} // end of main


} // end of class
 




