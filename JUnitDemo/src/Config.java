import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

	WebDriver driver = null;
	static Connection con = null;

	@Before
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\browser-drivers\\chromedriver_win32_2\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("http://www.nethorizonconsultancy.com/Seeker.aspx"); // short way

		// short cut
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);

		// return driver;
	}

	@BeforeClass
	public static void makeConnection() throws Exception {
		Class.forName("com.googlecode.sqlsheet.Driver");
		con = DriverManager.getConnection("jdbc:xls:file:D:\\corejava\\LoginTest.xlsx"); //

		// con=DriverManager.getConnection("jdbc:xls:file:C:\\core\\selenium\\responsive1.xls");
		// return con;
	}

	@After
	public void closeBrowser() throws Exception {
		driver.quit();

	}

}
