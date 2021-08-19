import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cars24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\corejava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.cars24.com/?utm_source=google&utm_medium=cpc&utm_campaign=brand&utm_source=google&utm_medium=adwords&utm_keyword=cars24&utm_matchtype=e&utm_device=c&adgroup_id=123136512693&campaign_id=1572572596&gclid=EAIaIQobChMInu3Tv4XK8QIVT7eWCh32CQldEAAYASAAEgLpZfD_BwE&gclid=EAIaIQobChMInu3Tv4XK8QIVT7eWCh32CQldEAAYASAAEgLpZfD_BwE");

		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[1]/div/div[2]/div/input"))
				.sendKeys("hyderabad");

	}

}
