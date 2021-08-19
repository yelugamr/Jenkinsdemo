import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestLog extends Config {

	Logger logger;

	public ExtentTest test = null;

	public ExtentReports report = null;

	public void logTest() throws Exception {

		logger = logger.getLogger("responselogger"); // to import the loging methods

		report = new ExtentReports("d:\\logs\\ExtentReportResults.html");// this is to save the html file

		test = report.startTest("Google");// start the test and intialized the test name

		test.log(LogStatus.INFO, "test start");

		WebDriver driver = openBrowser("chrome", "http://rminfotechsolutions.com/");
		logger.debug("Opened the chrome Browser and eneterd URL"); // logg file
		test.log(LogStatus.PASS, "chrome browser was opened "); // extent report file

		Date currentdate = new Date();
		System.out.println(currentdate);
		String ScreenshotFilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		Thread.sleep(2000);
		File ScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenshotFile, new File("D:\\screenshot\\" + ScreenshotFilename + ".png"));

		/*
		 * WebElement e = driver.findElement(By.name("q"));
		 * logger.debug("searched the element"); test.log(LogStatus.PASS,
		 * "Searched for the box ");
		 * 
		 * e.findElement(By.id("lst-ib")).sendKeys("Selenium");
		 * logger.info("Entered the search Criteria"); test.log(LogStatus.PASS,
		 * "Entered the RM infotech in box ");
		 * 
		 * driver.findElement(By.name("btnK")).click();
		 * logger.info("Clicked on the  the search Button"); test.log(LogStatus.PASS,
		 * "Searched for the search button ");
		 */

		report.endTest(test);
		report.flush();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestLog t = new TestLog();
		t.logTest();

	}

}
