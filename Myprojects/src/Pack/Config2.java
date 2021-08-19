package Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config2 {

	WebDriver driver = null;
	Connection con = null;

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

	public void closeBrowser() throws Exception {
		driver.quit();

	}

	public Connection makeConnection(String wb) throws Exception {
		Class.forName("com.googlecode.sqlsheet.Driver");
		con = DriverManager.getConnection("jdbc:xls:file:" + wb); //

		// con=DriverManager.getConnection("jdbc:xls:file:C:\\core\\selenium\\responsive1.xls");
		return con;
	}

}
