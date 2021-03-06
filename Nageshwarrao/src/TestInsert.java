import java.sql.Connection;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestInsert extends ConfigN {

	public Logger logs = null;

	public ExtentTest test = null;

	public ExtentReports report = null;

	Connection con = null;

	public void getconnected() throws Exception {

		logs = Logger.getLogger("insertlogger");

		// report generates the html formated file
		report = new ExtentReports("d:\\logs\\insert.html");

		// extent test allows to start the test
		ExtentTest test = report.startTest("Insert Data");

		// prints the data in log4j and extent report
		logs.debug("sheet connected rakesh to excel");
		test.log(LogStatus.PASS, "Sheet Connected");

		Connection con = makeConnection("D:\\corejava\\insar.xls");
		Statement stm = con.createStatement();

		logs.debug("Connected to excel");
		test.log(LogStatus.PASS, "Sheet Connected to excel");

		stm.executeUpdate("insert into Sheet1(user1,password) values('Rakesh','hai1')");

		logs.debug("Query was excuted");
		test.log(LogStatus.PASS, "Query was inserted");

		con.commit();
		con.close();

		System.out.println("inserted");

		logs.debug("Query was printed");
		test.log(LogStatus.PASS, "Query  printed");

		report.endTest(test);
		report.flush();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestInsert insert = new TestInsert();
		insert.getconnected();
	}

}
