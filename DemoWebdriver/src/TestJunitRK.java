import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestJunitRK extends Config {
	@Test
	public void clickin() {
		driver.findElement(By.xpath(
				"//*[@id=\"content\"]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[3]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/table/tbody/tr[3]/td/p/font[3]/a[1]"))
				.click();

	}

	@Before
	public void br() {
		WebDriver driver = openBrowser("Chrome", "http://www.idlebrain.com/");
		System.out.println("Browser was opened");
	}

	@After
	public void search() {
		driver.findElement(By.xpath(
				"//*[@id=\"content\"]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td/table/tbody[2]/tr[1]/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/font[1]/input"))
				.sendKeys("Hai");

	}

}
