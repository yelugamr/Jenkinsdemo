import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleElements extends Config {

	public void test() {
		WebDriver driver = openBrowser("chrome", "https://timesofindia.indiatimes.com/");

		WebElement entertainment = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[7]/div[2]/div[1]/div/div[2]"));

		List<WebElement> l = entertainment.findElements(By.tagName("a")); // finding all links on enetrtainment section
		// all iframe on on web page
		// List<WebElement> l = driver.findElements(By.tagName("iframe")); // finding
		// all links on web page

		Iterator<WebElement> it = l.iterator();
		while (it.hasNext()) {
			WebElement e = it.next(); // getting all links one by one

			String t = e.getText(); // getting link text
			String a = e.getAttribute("href"); // getting attribute value -> link source

			// String a = e.getAttribute("src");
			System.out.println(t + " link href " + a);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleElements m = new MultipleElements();
		m.test();
	}

}
