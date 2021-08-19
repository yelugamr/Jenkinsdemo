package core;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.TestConfig;
import utility.monitoringMail;
import utility.screenshot;

public class Page {
	public WebDriver driver = null;

	public Logger logs = null;

	public ExtentTest test = null;

	public ExtentReports report = null;

	@Parameters({ "browser", "url" })
	@BeforeTest
	public void beforeTest(String browser, String url) throws Exception {
		logs = Logger.getLogger("devpinoyLogger");
		report = new ExtentReports(System.getProperty("user.dir") + "\\test-output\\ExtentReportResults.html");

		test = report.startTest("ExtentDemo");

		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "d:\\browser-drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			logs.debug("firefox init");
			test.log(LogStatus.PASS, "Navigated to Firefox URL");
		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\browser-drivers\\chromedriver_win32_2\\chromedriver.exe");
			driver = new ChromeDriver();
			logs.debug("chrome inint");
			test.log(LogStatus.PASS, "Navigated to the chrome URL");
		}
		driver.navigate().to(url);
		logs.debug("url open..");
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() throws Exception {

		screenshot s = new screenshot();
		s.captureScreenShot(driver);

		monitoringMail mail = new monitoringMail();
		logs.debug("gmail server init..");
		test.log(LogStatus.PASS, "Gmail Server inint");
		try {
			logs.debug(TestConfig.server);
			logs.debug(TestConfig.from);
			logs.debug(TestConfig.to);
			logs.debug(TestConfig.subject);
			logs.debug(TestConfig.messageBody);
			logs.debug(TestConfig.attachmentPath);
			logs.debug(TestConfig.attachmentName);

			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody,
					TestConfig.attachmentPath, TestConfig.attachmentName);
			Thread.sleep(7000);
			System.out.println("awake...mail ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		logs.debug("mail sent");
		test.log(LogStatus.PASS, "Mail sent");
		driver.quit();
		logs.debug("driver quit");
		test.log(LogStatus.PASS, "Browser close");
		report.endTest(test);

		report.flush();

	}

}
