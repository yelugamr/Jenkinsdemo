import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestWebelements extends ConfigN {

	public void radio1() throws InterruptedException {
		WebDriver driver = openBrowser("chrome", "https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//*[@id=\"benzradio\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"bmwradio\"]")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hondaradio\"]")).click();

	}

	public void dropdown() {
		WebDriver driver = openBrowser("chrome", "https://courses.letskodeit.com/practice");
		WebElement ddown = driver.findElement(By.xpath("//*[@id=\"carselect\"]"));
		Select se = new Select(ddown);
		se.selectByIndex(1);
	}

	public void text() {
		WebDriver driver = openBrowser("chrome", "https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("My name is rakesh");

	}

	public void rightclick() {
		WebDriver driver = openBrowser("chrome", "https://courses.letskodeit.com/practice");
		Actions s = new Actions(driver);
		s.contextClick().build().perform();
	}

	public void hide1() throws Exception {
		WebDriver driver = openBrowser("chrome", "https://courses.letskodeit.com/practice");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();
	}

	public void tab1() throws Exception {
		WebDriver driver = openBrowser("chrome", "https://courses.letskodeit.com/practice");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();

		driver.switchTo().alert().accept();

	}

	public void switchwin1() throws Exception {
		WebDriver driver = openBrowser("chrome", "https://courses.letskodeit.com/practice");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div[2]/div/div/div/div/div[3]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().window(a.get(0));
	}

	public void frame1() throws Exception {
		WebDriver driver = openBrowser("chrome", "https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Main frame");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		Select courseName_dd = new Select(driver.findElement(By.id("course")));
		courseName_dd.selectByVisibleText("Java");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Back to  frame");

	}

	public void navigate1() throws Exception {
		WebDriver driver = openBrowser("chrome",
				"https://www.google.com/search?q=net+speed&sxsrf=ALeKk00fWMYQIS5yntGyJVG9UrWQ6RGGDw%3A1628680478058&source=hp&ei=HrETYd4ZyKLAA9epiLgJ&iflsig=AINFCbYAAAAAYRO_LqnfwcIKqo8HHAM8GFy3K0yCw9if&oq=&gs_lcp=Cgdnd3Mtd2l6EAEYADIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzINCC4QxwEQowIQ6gIQJzIHCCMQ6gIQJ1AAWABgzIUaaAFwAHgAgAEAiAEAkgEAmAEAsAEK&sclient=gws-wiz");
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();

		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
	}

	public void doubleclick() {
		WebDriver driver = openBrowser("chrome", "http://testautomationpractice.blogspot.com/");

		Actions a = new Actions(driver);
		a.doubleClick(driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"))).build().perform();

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestWebelements check = new TestWebelements();
		check.frame1();

	}

}
