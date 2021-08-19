import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestRetrivejdbx extends ConfigN {
	Connection con = null;

	public void getconnected() throws Exception {
		Connection con = makeConnection("D:\\corejava\\insar.xls");
		Statement stm = con.createStatement();

		ResultSet rs = stm.executeQuery("Select * from Sheet1");

		while (rs.next()) {
			String uid = rs.getString(1);
			String pwd = rs.getString(2);

			System.out.println(uid + " " + pwd);

		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		TestRetrivejdbx insert = new TestRetrivejdbx();
		insert.getconnected();

	}

}
