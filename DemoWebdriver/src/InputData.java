import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputData extends Config {

	public void inForm() throws InterruptedException {

		Scanner username = new Scanner(System.in);
		System.out.println("Enter the name");

		String user = username.nextLine();

		Scanner password = new Scanner(System.in);
		System.out.println("Enter the password ");

		String pwd = username.nextLine();

		WebDriver driver = openBrowser("chrome", "http://www.nethorizonconsultancy.com/Seeker.aspx");

		WebElement e = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_UserName\"]"));

		e.sendKeys("", user);

		WebElement d = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_Password\"]"));
		d.sendKeys("", pwd);

		Thread.sleep(2000);

		WebElement f = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_LoginButton\"]"));

		f.click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		InputData in = new InputData();
		in.inForm();

	}

}
