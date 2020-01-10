package net.antra1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//java.lang.String str=new java.lang.String();
		//Driver d=new oracle.jdbc.driver.OracleDriver();
		/*Class.forName("net.antra1.Demo");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);*/
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		//System.out.println(con);
		Statement stmt=con.createStatement();
	
		//stmt.executeUpdate("insert into employee values(2,'Rishi',54)");
		ResultSet rs=stmt.executeQuery("select * from employee");
		ResultSetMetaData rsm=rs.getMetaData();
		System.out.println(rsm.getColumnName(1));
		
		/*while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		}*/
	}

}
