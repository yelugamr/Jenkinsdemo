import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends Config {

	@Test
	public void test() throws Exception {

		Statement stm = con.createStatement();

		ResultSet rs = stm.executeQuery("select * from Sheet1");

		while (rs.next()) {

			String uid = rs.getString(1);
			String pwd = rs.getString(2);

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_UserName\"]")).sendKeys(uid);
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_Password\"]")).sendKeys(pwd);

			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_LoginButton\"]")).click();
		}
	}

	@Test
	public void test2() throws Exception {

		Statement stm = con.createStatement();

		ResultSet rs = stm.executeQuery("select * from Sheet1");

		while (rs.next()) {

			String uid = rs.getString(1);
			String pwd = rs.getString(2);

			System.out.println(uid + " " + pwd);
		}

	}

}
