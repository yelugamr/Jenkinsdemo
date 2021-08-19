import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\corejava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up?ref=guide-sendkeys-in-selenium&product=automate");
//maximsing chrome browser 
		driver.manage().window().maximize();
		Thread.sleep(6000);

		// Get the Web Element corresponding to the field Business Email (Textfield)
		WebElement Name = driver.findElement(By.id("user_full_name"));
		Thread.sleep(6000);

		// Get the Web Element corresponding to the Password Field
		WebElement email = driver.findElement(By.id("user_email_login"));
		Thread.sleep(6000);

		// Find the Sign me in button
		WebElement pwd = driver.findElement(By.id("user_password"));
		Thread.sleep(6000);

		WebElement agree = driver.findElement(By.name("terms_and_conditions"));
		Thread.sleep(6000);

		// Find the Sign me in button
		WebElement login = driver.findElement(By.name("commit"));
		Name.sendKeys("Raghu");
		email.sendKeys("HairakesehT1@gmail.com");
		pwd.sendKeys("Hai@123");
		agree.click();
		System.out.println("Create Email id is " + Name);
		System.out.print("This is the pwd" + pwd);
		login.click();
		System.out.println("Signed in with Click");
		driver.close();
	}

}
