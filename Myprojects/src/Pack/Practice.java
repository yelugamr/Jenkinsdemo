package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void wiki() {
		Config2 c = new Config2();
		c.openBrowser("chrome", "https://www.wikipedia.org/");
		WebDriver driver = new ChromeDriver();
		driver.findElements(By.xpath("//*[@id=\"searchInput\"]"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

	}

}
