import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoSelect extends Connect {

	public void selectdata() throws Exception {
		Connection con = makeConnection("D:\\corejava\\Test.xlsx");

		Statement stm = con.createStatement();

		ResultSet rs = stm.executeQuery("select * from Sheet1");

		while (rs.next()) {
			// String name = rs.getString("name");
			// int pd = rs.getInt("age");
// or
			String name = rs.getString(1);
			int pd = rs.getInt(2);
			System.out.println(name + "  " + pd);
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DemoSelect d = new DemoSelect();
		d.selectdata();
	}

}
