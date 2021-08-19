package Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Excel {

	static Connection con = null;

	public Connection getConn() throws SQLException {

		try {
			Class.forName("com.googlecode.sqlsheet.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con = DriverManager.getConnection("jdbc:xls:file:D:\\corejava\\Bookp.xlsx\\");
		System.out.println("Connected");
		return con;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		// Register the driver whichh is connecting to sql
		con.close();
	}

}
