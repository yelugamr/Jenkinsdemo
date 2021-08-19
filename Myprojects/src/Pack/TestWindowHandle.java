package Pack;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowHandle extends Config2 {

	public void winHandle() throws Exception {
		Connection con = makeConnection("D:\\corejava\\Bookp.xls");
		Statement stm = con.createStatement();

		Config2 D = new Config2();
		D.openBrowser("Chrome", "https://www.seleniumeasy.com/test/");
		WebDriver driver = new ChromeDriver();
		WebElement e = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[2]/a"));
		List<WebElement> w = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = w.iterator();
		while (it.hasNext()) {
			WebElement e1 = it.next(); // getting all links one by one

			String t = e1.getText(); // getting link text
			// System.out.println(t);
			stm.executeUpdate("INSERT INTO sheet1(Language)VALUES(" + t + ")");
			con.commit();
			con.close();
			stm = con.createStatement();
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		TestWindowHandle win = new TestWindowHandle();
		win.winHandle();

	}

}
