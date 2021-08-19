import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Moveinbetweenwindow {

	WebDriver driver = null;

	public void testnexttab1() {
		System.out.println("moved to tab..");
		driver.findElement(By.xpath("//*[@id=\"id_searchBase\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"id_q\"]")).sendKeys("Software Testing");

	}

	public void test() throws InterruptedException {
		Config c = new Config();
		driver = c.openBrowser("chrome", "https://www.shine.com/");
		driver.findElement(By.xpath("//*[@id=\"id_showform\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"id_q\"]")).sendKeys("Java Developer");

		driver.findElement(By.xpath("//html/body/footer/div/div/div/div/div[1]/ul[1]/li[3]/a")).click();

		driver.findElement(By.xpath("//html/body/footer/div/div/div/div/div[1]/ul[2]/li[3]/a")).click();

		Thread.sleep(3000);

		Set<String> s = driver.getWindowHandles(); // return reference of open tabs

		Iterator<String> it = s.iterator();

		// String cuuwindow=it.next(); // current tab
		// String title1=driver.getTitle();
		// System.out.println(title1);
		// System.out.println(" size "+s.size());

		while (it.hasNext()) {
			System.out.println("in while..");

			driver.switchTo().window(it.next()); // move control to next tab
			String title = driver.getTitle().trim();
			System.out.println(" title is " + title);

			if (title.equals("Job Search India - Latest Career Jobs and Employment")) {
				testnexttab1();
			} else if (title.equals("Free Job Posting – Shine Recruiter")) {
				driver.findElement(By.xpath("//*[@id=\"id_email_id\"]")).sendKeys("paragguide@gmail.com");
			}

		}
		// driver.switchTo().window(cuuwindow); // back to curr window
		// c.findMyElement("//*[@id=\"id_loc\"]").sendKeys("Pune");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Moveinbetweenwindow m = new Moveinbetweenwindow();
		m.test();
	}

}
