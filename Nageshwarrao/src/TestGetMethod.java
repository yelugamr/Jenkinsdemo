import java.util.Set;

import org.openqa.selenium.WebDriver;

public class TestGetMethod extends ConfigN {

	public void testGet() {

		WebDriver driver = openBrowser("firefox", "http://www.idlebrain.com/");
		// WebDriver driver = openBrowser("Chrome", "http://www.mercury-tours.com/");
		String x = driver.getTitle();
		System.out.println(x);

		// String x1 = driver.getPageSource();
		// System.out.println(x1);

		String x2 = driver.getCurrentUrl();
		if (x2.contains("http")) {
			System.out.println("Secure site");
		} else {
			System.out.println("Not a secure site");
		}

		System.out.println(x2);

		String x3 = driver.getWindowHandle();
		System.out.println(x3);

		Set<String> x4 = driver.getWindowHandles();
		System.out.println(x4);

		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGetMethod get = new TestGetMethod();
		get.testGet();
	}

}
