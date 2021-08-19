package com;

import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;

public class Config {

	public WebDriver driver = null;
	// Connection con = null;

	@Parameters({ "browser", "url" })
	@BeforeTest
	public void openBrowser(String browser, String url) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\browser-drivers\\chromedriver_win32_2\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "d:\\browser-drivers\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.navigate().to(url); // short way

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);

		// return driver;
	}

	@AfterTest
	public void closeBrowser() throws Exception {
		driver.quit();

	}

}
