import java.sql.Connection;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestDropdownList extends Config {

	public void test() throws Exception {

		/*
		 * WebDriver driver = openBrowser("firefox",
		 * "http://www.nethorizonconsultancy.com/newuser.aspx");
		 * 
		 * WebElement dd = driver.findElement(By.xpath("//*[@id=\"DropDownList2\"]"));
		 * // step1
		 * 
		 * // driver.findElement(By.xpath(
		 * "//html/body/form/div[3]/div[2]/div[2]/table/tbody/tr[7]/td[2]/select[1]"));
		 * 
		 * Select select = new Select(dd); // step2
		 * 
		 * select.selectByVisibleText("10");
		 */
		Connection con = makeConnection("D:\\corejava\\Backp.xls");
		Statement stm = con.createStatement();
		driver = openBrowser("chrome", "http://www.idlebrain.com/");

		WebElement e = driver.findElement(By.xpath(
				"//*[@id=\"content\"]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[5]/table/tbody/tr[4]/td/p"));

		// Select s = new Select(e);
		// s.selectByValue("ar");

		// driver = openBrowser("firefox", "https://www.wikipedia.org/");

		List<WebElement> l = e.findElements(By.tagName("a"));

		Iterator<WebElement> it = l.iterator();

		while (it.hasNext()) {
			String x = it.next().getAttribute("value"); // verify all values from excel sheet
			String sql = "insert into Sheet1(Movie) values('" + x + "')";

			// System.out.println(sql);
			stm.executeUpdate(sql);
			con.commit();
			con.close();
			// System.out.println(x);
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestDropdownList d = new TestDropdownList();
		d.test();
	}

}
