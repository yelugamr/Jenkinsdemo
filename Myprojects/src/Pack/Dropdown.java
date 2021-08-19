package Pack;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class Dropdown extends Config2 {

	String t = null;

	public void br() throws IOException {
		WebDriver driver = openBrowser("chrome", "https://www.makemytrip.com/");
		WebElement e = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]"));
		e.click();

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("d:\\screenshot\\resimage.png"));

		driver.close();
	}

	public void wiki() throws Exception {
		/*
		 * Connection con = makeConnection("D:\\corejava\\responsive1.xls"); Statement
		 * stm = con.createStatement(); Logs.debug("connected to workbook");
		 */

		Connection con = makeConnection("D:\\corejava\\Bookp.xls");
		Statement stm = con.createStatement();

		WebDriver driver = openBrowser("firefox", "https://www.wikipedia.org/");

		WebElement entertainment = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
		List<WebElement> w = driver.findElements(By.tagName("option"));
		Iterator<WebElement> it = w.iterator();
		while (it.hasNext()) {
			WebElement e = it.next(); // getting all links one by one

			String t = e.getText(); // getting link text
			// System.out.println(t);
			stm.executeUpdate("INSERT INTO sheet1(Language)VALUES(" + t + ")");
			con.commit();
			con.close();
			stm = con.createStatement();
		}
		/*
		 * if (t != null) { //
		 * stm.executeUpdate("insert in to sheet1",values('"+Languages+"')) //
		 * stm.executeUpdate("insert into sheet1(Languages) values('" + Languages + "')
		 * // "); // stm.executeUpdate("insert into sheet1 Languages",
		 * values('"Langugaes"'));
		 * stm.executeUpdate("INSERT INTO sheet1(Languages)VALUES(" + t + ")");
		 * con.commit(); con.close(); stm = con.createStatement(); }
		 */
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-gene;rated method stub
		Dropdown dr = new Dropdown();
		dr.wiki();

	}

}
