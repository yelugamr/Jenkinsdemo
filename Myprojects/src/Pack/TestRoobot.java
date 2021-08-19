package Pack;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TestRoobot {

	public void calc() throws Exception {
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(5000);

		StringSelection s1 = new StringSelection("24");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyRelease(KeyEvent.VK_V);

		// click plus symbol
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);

		StringSelection s2 = new StringSelection("45");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyRelease(KeyEvent.VK_V);

		// click plus symbol
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);

		r.keyPress(KeyEvent.VK_CONTEXT_MENU);
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);

		String output = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(output);

		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);

		r.keyRelease(KeyEvent.VK_F4);
		// get output display

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestRoobot cal = new TestRoobot();
		cal.calc();
	}

}
