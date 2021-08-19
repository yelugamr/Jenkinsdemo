package com;

public class Parent {

	
	public void publicmethod()
	{
		System.out.println("i am public method");
	}
	
	protected void protectedmethod()
	{
		System.out.println("i am protected");
	}
	
	void defaultmethod()
	{
		System.out.println("i am default method");
	}
	
	private void privatemethod()
	{
		System.out.println("i am private");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p = new Parent();
p.publicmethod();
p.protectedmethod();
p.defaultmethod();
p.privatemethod();
	}

}
