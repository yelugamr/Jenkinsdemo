package com;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {

	@Test(dataProvider = "dp")
	public void f(Integer n, String s, double d) {

		System.out.println("yest called with " + n + " , " + s);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a", 2.5 }, new Object[] { 2, "b", 5.6 },
				new Object[] { 3, "c", 9.6 } };
	}
}
