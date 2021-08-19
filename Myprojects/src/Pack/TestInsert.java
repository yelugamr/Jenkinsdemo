package Pack;

import java.sql.Connection;
import java.sql.Statement;

public class TestInsert extends Config2 {

	public void Testinset() throws Exception {
		// get connections to excel sheet
		Connection con = makeConnection("D:\\corejava\\Backp.xls");
		Statement stm = con.createStatement();
		String i = "rakesh";
		String k = "34";
		System.out.println(i);

		String sql = "insert into Sheet1(name,age) values('" + i + "'," + k + ")";

		System.out.println(sql);
		stm.executeUpdate(sql);
		con.commit();
		con.close();

		String a = "rakesh";
		String b = "22";
		System.out.println("my name is '" + a + "' and age is" + b);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestInsert in = new TestInsert();
		in.Testinset();
	}

}
