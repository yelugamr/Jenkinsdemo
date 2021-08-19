package democorejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	 WebDriver driver;
	public void openbrowser(String browser)
	{
		if(browser == "chrome")
		{
		 System.setProperty("webdriver.chrome.driver","D:\\corejava\\chromedriver.exe" );
		driver   =new ChromeDriver();
		}
		else if (browser == "firefox")
		{
			// write firefox driver code..
		}
		   
	}
	
	public void test(String url)
	{
		driver.navigate().to(url);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("hello");
		
		//connecting with the chrome 
    Test2 t = new Test2(); // constructor
    
    t.openbrowser("chrome");
    t.test("http://google.com");
    
	}

}
