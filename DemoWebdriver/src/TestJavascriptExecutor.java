import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestJavascriptExecutor {

	public static void main(String[] args) throws Exception {

		Config c = new Config();
		WebDriver driver = c.openBrowser("firefox", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_events1");
		// WebDriver driver = c.openBrowser("firefox",
		// "http://printingadda.com/review.php");

		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

		System.out.println("moved to iframe..");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("displayDate()"); // call script function on webpage
		// directly

		System.out.println("JS Exceuted..");

		// js.executeScript("zoomimg('./uploadWork/WhatsApp Image 2017-12-19 at 2.45.23
		// PM (1).jpeg')");
	}

}
