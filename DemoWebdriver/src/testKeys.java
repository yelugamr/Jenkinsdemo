import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class testKeys {

	public static void main(String[] args) {

		Config c = new Config();
		WebDriver driver = c.openBrowser("firefox", "http://www.nethorizonconsultancy.com/Seeker.aspx");

		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Login1_UserName']")).sendKeys("sdfdsf");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Login1_Password']")).sendKeys("sdfdf");

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();

		// action.sendKeys(Keys.chord(Keys.ALT , Keys.SPACE)).perform();

//To Select whole page:

//driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));

//cssSelector is faster than xpath. So it could be done by using CSSPath also. Below is the way:

//driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));

		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));

		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
		/* */

	}

}
