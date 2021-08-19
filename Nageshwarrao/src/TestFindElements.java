import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFindElements extends ConfigN {

	public void test1() {
		WebDriver driver = openBrowser("firefox", "http://testautomationpractice.blogspot.com/");
//listing th/e elemetns in the webpage
		/*
		 * WebElement entertainment =
		 * driver.findElement(By.xpath("//*[@id=\"speed\"]")); List<WebElement> l =
		 * entertainment.findElements(By.tagName("a")); System.out.println(l);
		 */

		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Rakesh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFindElements el = new TestFindElements();
		el.test1();
	}

}
