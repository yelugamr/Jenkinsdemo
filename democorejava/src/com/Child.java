package com;

public class Child extends Parent implements Inter3  {
	
	public void inter1msg()
	{
		System.out.println("1");
	}
	
	public void inter2msg()
	{
		System.out.println("2");
	}
	
	public void inter3msg()
	{
		System.out.println("3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c = new Child();
c.inter1msg();
c.inter2msg();
c.inter3msg();
c.publicmethod();
c.protectedmethod();
c.defaultmethod();
//c.privatemethod();
	}

}
