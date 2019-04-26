package GroupProject.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnect {
	
	public static Connection getConnection() throws SQLException{
		Connection connection = null;
		if(connection==null || connection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","");		

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}

