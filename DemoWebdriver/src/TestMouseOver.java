import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMouseOver {

	public static void main(String[] args) throws Exception {

		Config c = new Config();
		WebDriver driver = c.openBrowser("chrome", "http://timesofindia.indiatimes.com/");
		Thread.sleep(2000);

// explicit wait		
		WebDriverWait wait = new WebDriverWait(driver, 80L); // long time in mil sec

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div/div/div[2]/nav/ul/li[5]/a")));

		if (element != null) {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform(); // mouse move to world
			System.out.println("mouse over world.. action performed..");

			element = wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div/div/div[2]/nav/ul/li[5]/div/div[1]/a[3]")));

			if (element != null) {
				element.click(); // click on pakistan
				System.out.println("link clicked..");
			} else {
				System.out.println("element not clicked");
			}

		}

		else {
			System.out.println("pak link not click");
		}

	}

}
