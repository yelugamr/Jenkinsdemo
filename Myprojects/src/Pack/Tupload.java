package Pack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tupload extends Config2 {

	public void upload() throws IOException, InterruptedException, Exception {
		WebDriver driver = openBrowser("firefox", "https://easyupload.io/");
		driver.findElement(By.xpath("//*[@id=\"dropzone\"]/div/button")).click();

		Runtime.getRuntime().exec("d:/logs/uploadfile.exe"); // call exe

		/*
		 * Robot r = new Robot(); StringSelection s = new
		 * StringSelection("E:\\Software testing Data\\rakesh1.xls");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		 * r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_V);
		 * r.keyRelease(KeyEvent.VK_CONTROL); r.keyRelease(KeyEvent.VK_V);
		 * 
		 * r.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * // Runtime.getRuntime().exec("E:/small data.jpg"); //
		 * Runtime.getRuntime().exec("d:/logs/uploadfile.exe"); //
		 * Runtime.getRuntime().exec("d:/logs/uploadfile.exe"); // call exe
		 */
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Tupload Test = new Tupload();
		Test.upload();

	}

}
