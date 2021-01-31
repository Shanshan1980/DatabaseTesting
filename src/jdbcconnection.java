import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		//connect database URL: "jdbc:mysql://"+host+":"+port+"/databasename"
		//JDBC driver url should be as below:
		String dbUrl="jdbc:mysql://localhost:3306/qadbt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
		Connection con= DriverManager.getConnection(dbUrl, "root", "123456");
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("Select * from credentials where scenario='shoppingcard'");
		while(rs.next())
		{
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		}
	}

}
