import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ResolutionTest extends Config {

	public Logger logs = null;

	public ExtentTest test = null;

	public ExtentReports report = null;

	public void test() throws Exception {

		logs = Logger.getLogger("responselogger");

		report = new ExtentReports("d:\\logs\\ExtentReportResults.html");

		test = report.startTest("ResponsivetDemo");

		makeLogs("responselogger", "d:\\logs\\ExtentReportResults.html");

		test.log(LogStatus.INFO, "test called");

// make connection
		Connection con = makeConnection("D:\\corejava\\responsive1.xls");
		Statement stm = con.createStatement();

		logs.debug("connected to workbook");

		test.log(LogStatus.PASS, "connected to workbook");

		ResultSet rs = stm.executeQuery("select * from Sheet1");
		int cc = 0;
		while (rs.next()) {
			// getting from excel

			String browser = rs.getString(1);
			String url = rs.getString(2);
			String resolution = rs.getString(3);

			StringTokenizer str = new StringTokenizer(resolution, ",");

			int reswidth = Integer.parseInt(str.nextToken().trim());
			System.out.println(reswidth);

			int resheight = Integer.parseInt(str.nextToken().trim());
			System.out.println(resheight);

			String ewd = rs.getString(4).trim();
			String ehg = rs.getString(5).trim();
//log and Report
			logs.debug("got data from excel " + browser + " , " + url);

			test.log(LogStatus.PASS, "got data from excel " + browser + " , " + url);

			WebDriver d = openBrowser(browser, url);
			// Dimension d1= d.manage().window().getSize();
			// System.out.println(d1);

			d.manage().window().setSize(new org.openqa.selenium.Dimension(reswidth, resheight));
			Thread.sleep(2000);
//log and Report
			logs.debug("browser open resolution " + reswidth + " , " + resheight);

			test.log(LogStatus.PASS, "browser open resolution " + reswidth + " , " + resheight);

			// screen shot code
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // store file to temprary
																						// location
			// Now you can do whatever you need to do with it, for example copy somewhere
			// download org.apache.commons.io.FileUtils class API set classpath and use this
			// class to copy.
			FileUtils.copyFile(scrFile, new File("d:\\screenshot\\resimage-" + cc++ + ".png"));
//log and Report
			logs.debug("screen shot taken");

			test.log(LogStatus.PASS, "screen shot taken");

			// reading xpath from external sourse xpaths.properties file
			Properties OR = new Properties();

			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\xpaths.properties");
			OR.load(fis);
			String imgxpath = OR.getProperty("imgxpath"); // read value from properties file

			logs.debug("xpath of image from webpage " + imgxpath);
			test.log(LogStatus.INFO, " xpath of image from webpage " + imgxpath);

			WebElement e = d.findElement(By.xpath(imgxpath)); // finding image on page

			String actualwidth = e.getCssValue("width"); // getting css value of image
			String actualheight = e.getCssValue("height");

			System.out.println(actualwidth + " " + actualheight);

// log and Report
			logs.debug("actual w " + actualwidth + " actual h" + actualheight);

			test.log(LogStatus.PASS, "actual w " + actualwidth + " actual h" + actualheight);

			if (actualwidth.equals(ewd) && actualheight.equals(ehg)) {
				// pass
				stm.executeUpdate(
						"insert into sheet2(resolution,expimgwidth,expimgheight,actualimgwidth,actualimgheight,status) values('"
								+ resolution + "','" + ewd + "','" + ehg + "','" + actualwidth + "','" + actualheight
								+ "','Pass') ");
				con.commit();
				con.close();
				stm = con.createStatement();

				// log and Report
				logs.debug("pass");
				test.log(LogStatus.PASS, "pass");

			} else {
				// fail
				stm.executeUpdate(
						"insert into sheet2(resolution,expimgwidth,expimgheight,actualimgwidth,actualimgheight,status) values('"
								+ resolution + "','" + ewd + "','" + ehg + "','" + actualwidth + "','" + actualheight
								+ "','fail') ");
				con.commit();
				con.close();
				stm = con.createStatement();

				// log and Report
				logs.debug("fail");
				test.log(LogStatus.FAIL, "fail");

			}

		}

		// very important to close extent report else report will not generate
		// report.endTest(test);

		// report.flush();
		closeBrowser();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ResolutionTest r = new ResolutionTest();
		r.test();
	}

}
