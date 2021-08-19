import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test1 {
	public Logger logs = null;

	public ExtentTest test = null;

	public ExtentReports report = null;
	WebDriver driver = null;

	public void test() throws Exception {
		logs = Logger.getLogger("responselogger");

		report = new ExtentReports("d:\\logs\\ExtentReportResults.html");

		test = report.startTest("ResponsivetDemo");

		test.log(LogStatus.INFO, "test called");

		System.setProperty("webdriver.gecko.driver", "d:\\browser-drivers\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		driver.manage().window().maximize();

		WebElement e = driver.findElement(By.xpath(""));

		System.setProperty("webdriver.chrome.driver", "D:\\browser-drivers\\chromedriver_win32_2\\chromedriver.exe");

		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://www.google.com");

		driver1.manage().window().maximize();

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		t.test();
	}

}
