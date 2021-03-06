import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Config {

	WebDriver driver = null;
	Connection con = null;

	public Logger logs = null;

	public ExtentTest test = null;

	public ExtentReports report = null;

	public WebDriver openBrowser(String browser, String url) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\browser-drivers\\chromedriver_win32_2\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "d:\\browser-drivers\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		// long way
		// WebDriver.Navigation nav = driver.navigate();
		// nav.to(url);

		driver.navigate().to(url); // short way

		// long cut
		// WebDriver.Options o= driver.manage();
		// WebDriver.Window w= o.window();
		// w.maximize();

		// short cut
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);

		return driver;
	}

	public void makeLogs(String name, String path) {
		logs = Logger.getLogger(name);

		report = new ExtentReports(path);

		test = report.startTest(name);

	}

	public void closeBrowser() throws Exception {
		driver.quit();

		report.endTest(test); // close extent report

		report.flush();

		monitoringMail m = new monitoringMail();

		m.sendMail(MailConfig.server, MailConfig.from, MailConfig.to, MailConfig.subject, MailConfig.messageBody,
				MailConfig.attachmentPath, MailConfig.attachmentName);
		System.out.println("mail sent");

	}

	public Connection makeConnection(String wb) throws Exception {
		Class.forName("com.googlecode.sqlsheet.Driver");
		con = DriverManager.getConnection("jdbc:xls:file:" + wb); //

		// con=DriverManager.getConnection("jdbc:xls:file:C:\\core\\selenium\\responsive1.xls");
		return con;
	}

}
