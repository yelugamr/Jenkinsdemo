import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFileUpload {

	public static void main(String[] args) throws Exception {
		try {
			Config c = new Config();
			WebDriver driver = c.openBrowser("chrome", "https://gofile.io/uploadFiles");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"rowUploadButton\"]/div/div/div/div/div/div[1]/div/button")).click();
			System.out.println("element clicked..");

//Runtime is a java.lang class and exec() is java method to run .exe program
			// call a script
			Thread.sleep(5000);
			System.out.println("calling Auto IT script .exe file");
			Runtime.getRuntime().exec("d:/logs/uploadfile.exe"); // call exe

			// driver.quit();

			Thread.sleep(3000);

//driver.findElement(By.xpath("//*[@id=\"upload\"]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
