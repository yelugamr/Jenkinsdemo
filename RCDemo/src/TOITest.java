import java.util.StringTokenizer;

import com.thoughtworks.selenium.DefaultSelenium;

public class TOITest {

	public void test() throws Exception {
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444,
				"*firefox C:\\Users\\HP\\Downloads\\firefox-sdk\\bin\\firefox.exe",
				"https://timesofindia.indiatimes.com");
		selenium.start();
		selenium.open("/poll.cms");
		selenium.windowMaximize();
		selenium.windowFocus();

		selenium.click("//*[@id=\"pollform\"]/table/tbody/tr[2]/td/input[1]");
		// or
		// selenium.click("//html/body/table/tbody/tr/td/div/table/tbody/tr/td/form/table/tbody/tr[2]/td/input[1]");
		String q = selenium.getText("//*[@id=\"mathq2\"]");

		StringTokenizer str = new StringTokenizer(q, "+=");

		int no1 = Integer.parseInt(str.nextToken().trim());
		int no2 = Integer.parseInt(str.nextToken().trim());

		int sum = no1 + no2;

		selenium.type("//*[@id=\"mathuserans2\"]", "" + sum);

		selenium.click("//*[@id=\"pollform\"]/table/tbody/tr[4]/td/div");

		Thread.sleep(1000);

		String msg = selenium.getText("//*[@id=\"polldiv\"]/table/tbody/tr/td/table[1]/tbody/tr/td/font/b").trim();
		System.out.println(msg);

		if (msg.equals("You have successfully cast your vote.")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TOITest t = new TOITest();

		t.test();
	}

}
