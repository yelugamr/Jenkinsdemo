import java.sql.Connection;
import java.sql.Statement;

public class DemoInsert extends Connect {

	public void insertdata() throws Exception {
		Connection con = makeConnection("D:\\corejava\\Test.xlsx");

		Statement stm = con.createStatement();

		int i = stm.executeUpdate("insert into Sheet1(name,age) values('rakesh',27)");
		con.commit();
		con.close();

		if (i == 1) {
			System.out.println("inserted");
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DemoInsert d = new DemoInsert();
		d.insertdata();

	}

}
