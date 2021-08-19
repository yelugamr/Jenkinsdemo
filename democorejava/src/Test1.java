import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

// opening chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\corejava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");

//maximsing chrome browser 
		driver.manage().window().maximize();

// opening the register form
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rakesh");
		driver.findElement(By.name("lastname")).sendKeys("tesintg");
		WebElement day = driver.findElement(By.name("email"));

// .sendKeys("testingwarangaT@gmail.com");
		day.sendKeys("testingwarangaT28@gmail.com");
		System.out.println(day.getAttribute("value"));
		driver.findElement(By.name("telephone")).sendKeys("9845789652");
		driver.findElement(By.name("password")).sendKeys("Hitesting@123");
		driver.findElement(By.name("confirm")).sendKeys("Hitesting@123");
		driver.findElement(By.name("agree")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();

// After regestraion geting the title
		String msg = driver.getTitle();
		System.out.println(msg);
		if (msg.equals("Your Account Has Been Created!")) {
			System.out.println("Account was created ");
		} else {
			System.out.println("Account was not created");
		}
		Thread.sleep(5000);

// Log out 

		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();

		String msg1 = driver.getTitle();
		System.out.println(msg);

		if (msg1.equals("Account Logout")) {
			System.out.println("Account was Loged out ");
		} else {
			System.out.println("Account was not Loged out");
		}

		Thread.sleep(5000);

// Getting login using created credentiols

		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.name("email")).sendKeys("testingwarangaT1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Hitesting@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

		// Again logout Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();

	}

}
