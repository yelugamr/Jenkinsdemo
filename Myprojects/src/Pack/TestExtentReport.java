package Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestExtentReport {
	static ExtentTest test;
	static ExtentReports report;

	public static void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}

	public void extentReportsDemo() {
		System.setProperty("webdriver.chrome.driver",
				"D:SubmittalExchange_TFSQAAutomation3rdpartychromechromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");

		if (driver.getTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}

	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
}