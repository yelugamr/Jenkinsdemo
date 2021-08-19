import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PollsTest extends Config

{

	public void test() throws IOException {
		WebDriver driver = openBrowser("firefox", "https://timesofindia.indiatimes.com/poll.cms");

		WebElement e = driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[2]/td/input[1]"));

		e.click();

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("d:\\screenshot\\resimage.png"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PollsTest t = new PollsTest();
		t.test();
	}

}
