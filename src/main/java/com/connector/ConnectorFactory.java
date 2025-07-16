package com.connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectorFactory {
	
	static Connection con  = null;
	static String url = "jdbc:mysql://localhost:3306/university";
	static String user = "root";
	static String pwd = "teju@123";
	
	static public Connection reqConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,user,pwd);
		return con;
	}

}
