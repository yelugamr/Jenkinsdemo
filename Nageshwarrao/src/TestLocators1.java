import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestLocators1 extends ConfigN {

	public void locators() {
//to calculate the total number of web elements in the page 
		WebDriver driver = openBrowser("chrome", "http://www.idlebrain.com/index3.html");
		WebElement links = driver.findElement(By.tagName("a"));
		// links.getSize();
		System.out.println(links.getSize());
		driver.findElement(By.linkText("Ghani for Diwali 2021")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLocators1 rt = new TestLocators1();
		rt.locators();
	}

}
