import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo extends Config {

	public void test() {
		WebDriver driver = openBrowser("chrome", "http://www.gmail.com");

		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("roliguide@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 80L); // long time in mil sec
		WebElement element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")));

		if (element != null) {
			element.sendKeys("abcd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExplicitWaitDemo d = new ExplicitWaitDemo();
		d.test();
	}

}
