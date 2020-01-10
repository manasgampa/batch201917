package net.antra1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement stmt=con.createStatement();
		//stmt.executeUpdate("insert into employee values(2,'Rishi',54)");
		ResultSet rs=stmt.executeQuery("select * from employee where Id="+id);
		while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		}
		con.close();
	
	}
}
