package Pack;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestUpload extends Config2 {

	public void login() throws Exception {

		WebDriver driver = openBrowser("firefox", "https://easyupload.io/");
		driver.findElement(By.xpath("//*[@id=\"dropzone\"]/div/button")).click();

		Robot r = new Robot();
		StringSelection s1 = new StringSelection("E:\\Software testing Data\\full.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2500);

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		TestUpload mail = new TestUpload();
		mail.login();

	}

}
