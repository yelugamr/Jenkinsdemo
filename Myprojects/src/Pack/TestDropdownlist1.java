package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDropdownlist1 {

	public static void drop() {
		Config2 c = new Config2();
		c.openBrowser("Chrome", "https://www.seleniumeasy.com/test/");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[2]/a"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
