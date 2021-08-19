package com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	public void test() {
		System.out.println("text");
	}

	@Parameters({ "b", "u" })
	@BeforeMethod
	public void open(String browser, String url) {
		System.out.println("open " + browser + " " + url);
	}

	@AfterMethod
	public void close() {
		System.out.println("close");
	}

}
