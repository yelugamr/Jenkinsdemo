import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.thoughtworks.selenium.DefaultSelenium;

public class TestTitle extends Connect {

	public void test() throws Exception {
		Connection con = makeConnection("d:\\corejava\\TestTitle.xls");
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from Sheet1");

		while (rs.next()) {
			// getting data from execel
			String burl = rs.getString(1);
			String lpage = rs.getString(2);
			String etitle = rs.getString(3).trim();

			DefaultSelenium selenium = new DefaultSelenium("localhost", 4444,
					"*firefox C:\\Users\\HP\\Downloads\\firefox-sdk\\bin\\firefox.exe", burl);
			selenium.start();
			selenium.open("/" + lpage);
			selenium.windowMaximize();
			selenium.windowFocus();
			Thread.sleep(6000);
			String atitle = selenium.getTitle().trim(); // getting from webpage
			System.out.println(atitle);
			if (atitle.equals(etitle)) {
				// pass

				stm.executeUpdate("insert into Sheet2(url,expectedtitle,actualtitle,status) values('" + burl + "/"
						+ lpage + "','" + etitle + "','" + atitle + "','Pass')");
				con.commit();
				con.close();
				stm = con.createStatement();
			} else {
				// fail
				stm.executeUpdate("insert into Sheet2(url,expectedtitle,actualtitle,status) values('" + burl + "/"
						+ lpage + "','" + etitle + "','" + atitle + "','fail')");
				con.commit();
				con.close();
				stm = con.createStatement();
			}

		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestTitle t1 = new TestTitle();
		t1.test();
	}

}
