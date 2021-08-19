import java.sql.Connection;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown extends Config {

	public void wiki() throws Exception {
		/*
		 * Connection con = makeConnection("D:\\corejava\\responsive1.xls"); Statement
		 * stm = con.createStatement(); Logs.debug("connected to workbook");
		 */

		Connection con = makeConnection("D:\\corejava\\Bookp.xls");
		Statement stm = con.createStatement();

		WebDriver driver = openBrowser("chrome", "https://www.wikipedia.org/");

		WebElement entertainment = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
		List<WebElement> w = driver.findElements(By.tagName("option"));
		Iterator<WebElement> it = w.iterator();
		// ResultSet rs = stm.executeQuery("select * from Sheet1");
		while (it.hasNext()) {
			WebElement e = it.next(); // getting all links one by one

			String t = e.getText(); // getting link text
			System.out.println(t);
			stm.executeUpdate("insert into sheet1(Language) values(" + t + ")");

		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dropdown dr = new Dropdown();
		dr.wiki();
	}

}
