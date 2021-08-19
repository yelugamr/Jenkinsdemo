import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class TestWb extends Config {

	String user = null;
	String pwd = null;

	public void insertdata() throws Exception {

		WebDriver driver = openBrowser("chrome", "http://www.nethorizonconsultancy.com/Seeker.aspx");

		Connection con = makeConnection("D:\\corejava\\LoginTest.xlsx");
		Statement stm = con.createStatement();
		ResultSet a = stm.executeQuery("select * from Sheet1");

		makeLogs("responselogger", "d:\\logs\\ExtentReportResults1.html");

		test.log(LogStatus.INFO, "test called");

		while (a.next()) {
			// getting from excel

			user = a.getString("userid");
			pwd = a.getString("password");
			test.log(LogStatus.INFO, "testing for " + user + " , " + pwd);

			// reading xpath from external sourse xpaths.properties file
			Properties OR = new Properties();

			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\LoginXpath.properties");
			OR.load(fis);
			String userxpath = OR.getProperty("userxpath"); // read value from properties file
			String userpwd = OR.getProperty("userpwd"); // read value from properties file
			String userlogin = OR.getProperty("userlogin"); // read value from properties file
			String usermsg = OR.getProperty("usermsg"); // read value from properties file

			driver.findElement(By.xpath(userxpath)).clear();
			driver.findElement(By.xpath(userxpath)).sendKeys(user);

			driver.findElement(By.xpath(userpwd)).clear();
			driver.findElement(By.xpath(userpwd)).sendKeys(pwd);

			Thread.sleep(2000);
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // store file to temprary

			FileUtils.copyFile(scrFile, new File("d:\\screenshot\\LoginScrBefore-" + user + ".png"));
			Thread.sleep(1000);

			driver.findElement(By.xpath(userlogin)).click();

			Thread.sleep(2000);

			FileUtils.copyFile(scrFile, new File("d:\\screenshot\\LoginScrAfter-" + user + ".png"));

			String msg = driver.findElement(By.xpath(usermsg)).getText();

			Date date = new Date();

			int d = date.getDay();
			int m = date.getMonth();
			int y = date.getYear();

			String dt = d + "-" + m + "-" + y;
			if (msg == null) {
				// member

				stm.executeUpdate("insert into Sheet2 (userid,password,status,date) values('" + user + "','" + pwd
						+ "','Member','" + dt + "')");
				con.commit();
				con.close();
				con = makeConnection("D:\\corejava\\LoginTest.xlsx");
				stm = con.createStatement();

				test.log(LogStatus.PASS, "member");
			}

			else {
				// not member
				stm.executeUpdate("insert into Sheet2 (userid,password,status,date) values('" + user + "','" + pwd
						+ "','NotMember','" + dt + "')");
				con.commit();
				con.close();
				con = makeConnection("D:\\corejava\\LoginTest.xlsx");
				stm = con.createStatement();
				test.log(LogStatus.FAIL, "Not memebr");
			}

		}

		driver.close();
	}

	public void register() {

		Scanner userid = new Scanner(System.in);
		System.out.println("Enter the name ");

		String Uid = userid.nextLine();

		Scanner password = new Scanner(System.in);
		System.out.println("Enter the password ");

		String pwd = password.nextLine();

		Scanner firstname = new Scanner(System.in);
		System.out.println("Enter the firstname ");

		String Fname = firstname.nextLine();

		Scanner lastname = new Scanner(System.in);
		System.out.println("Enter the lastname ");

		String Lname = lastname.nextLine();

		System.out.println("Enter the date in dd-mmm-yyyy ");
		Scanner Dateofbirth = new Scanner(System.in);

		String Dob = Dateofbirth.nextLine();

		StringTokenizer str = new StringTokenizer(Dob, "-");

		String dd = str.nextToken().trim();
		String mmm = str.nextToken().trim();
		String yyyy = str.nextToken().trim();

		System.out.println("Enter the localadd ");
		Scanner localadd = new Scanner(System.in);

		String Loadd = localadd.nextLine();

		Scanner permadd = new Scanner(System.in);
		System.out.println("Enter the permadd ");

		String padd = permadd.nextLine();

		Scanner mobile = new Scanner(System.in);
		System.out.println("Enter the mobile ");

		String Mnum = mobile.nextLine();

		Scanner email = new Scanner(System.in);
		System.out.println("Enter the email ");

		String Emil = email.nextLine();

		Scanner fathern = new Scanner(System.in);
		System.out.println("Enter the fathern ");

		String Fathname = fathern.nextLine();

		Scanner gender = new Scanner(System.in);
		System.out.println("Enter the fathern ");

		String gen = gender.nextLine();

		Scanner securityq = new Scanner(System.in);
		System.out.println("Enter the securityq ");

		String secq = securityq.nextLine();

		Scanner securityans = new Scanner(System.in);
		System.out.println("Enter the securityans ");

		String sanw = securityans.nextLine();

		WebDriver driver = openBrowser("chrome", "http://www.nethorizonconsultancy.com/newuser.aspx");

// user id
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox1\"]"));
		a1.sendKeys("", Uid);
// password
		WebElement a2 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox2\"]"));
		a2.sendKeys("", pwd);
// First name
		WebElement a3 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox3\"]"));
		a3.sendKeys("", Fname);
// Last name
		WebElement a4 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox4\"]"));
		a4.sendKeys("", Lname);
// Date of Birth
		WebElement a5 = driver.findElement(By.xpath("//*[@id=\"DropDownList2\"]"));

		Select select = new Select(a5); // step2

		select.selectByVisibleText(dd);

		Select mm = new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_DropDownList3\"]")));
		mm.selectByVisibleText(mmm);

		Select yy = new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_DropDownList4\"]")));
		yy.selectByVisibleText(yyyy);

		// a5.sendKeys("", Dob);
// local address
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox6\"]")).sendKeys(Loadd);
		// a6.sendKeys( Loadd);
// Permanent address

		/*
		 * WebElement a7 =
		 * driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox7\"]"));
		 * a7.sendKeys("", padd); // mobile number WebElement a8 =
		 * driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox8\"]"));
		 * a8.sendKeys("", Mnum); // Email address WebElement a9 =
		 * driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox9\"]"));
		 * a9.sendKeys("", Emil); // Father name WebElement a10 =
		 * driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox10\"]"));
		 * a10.sendKeys("", Fathname); // Gender WebElement a11 =
		 * driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox2\"]"));
		 * a11.sendKeys("", gen); // Sequrity question
		 * 
		 * WebElement a12 =
		 * driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox11\"]"));
		 * a12.sendKeys("", secq); // Security answer WebElement a13 =
		 * driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox12\"]"));
		 * a13.sendKeys("", sanw);
		 * 
		 */
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		TestWb ls = new TestWb();
		// ls.register();

		ls.insertdata();

	}

}
