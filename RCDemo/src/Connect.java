import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	Connection con = null;

	// user method..
	public Connection makeConnection(String wb) throws Exception {
		// Register Driver
		Class.forName("com.googlecode.sqlsheet.Driver");

		// Connect to Excel – xls format only

		con = DriverManager.getConnection("jdbc:xls:file:" + wb);
		System.out.println("connected to wb");

		return con;
	}

}
