import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testFrame {

	public static void main(String[] args) throws Exception {

		Config c = new Config();
		WebDriver driver = c.openBrowser("chrome",
				"https://www.w3schools.com/css/tryit.asp?filename=trycss_font-family");

		// WebDriver driver = c.openBrowser("chrome",
		// "http://www.rminfotechsolutions.com/selenium-intro-1.html");

// with Frame  id

		driver.switchTo().frame("iframeResult");

		String txt = driver.findElement(By.xpath("//html/body/h1")).getText();
		System.out.println(txt);

// without Frame id

		// driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		// driver.findElement(By.xpath("//*[@id=\"t1\"]")).sendKeys("Parag");

//driver.switchTo().defaultContent(); //go back to old frame / parent window
//System.out.println("back to main frame");
//Thread.sleep(5000);
//String email=driver.findElement(By.xpath("//*[@id=\"textt2\"]/table/tbody/tr/td/strong[4]")).getText();
//System.out.println("Email "+email);

	}

}
