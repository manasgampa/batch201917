package net.antra1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx3 {
	
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
	
		con.setAutoCommit(false);
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
	
		try {
		pstmt.setInt(1,1);
		pstmt.setString(2, "manas");
		pstmt.setInt(3, 123);
		pstmt.addBatch();
		//pstmt.execute();
		
		pstmt.setInt(1, 2);
		pstmt.setString(2, "Liang");
		pstmt.setInt(3, 34);
		//pstmt.execute();
		pstmt.addBatch();
		
		pstmt.setInt(1, 3);
		pstmt.setString(2,"Rishi");
		pstmt.setInt(3, 563);
		pstmt.addBatch();
		//pstmt.execute();
		pstmt.executeBatch();
		con.commit();
		}catch(Exception e) {
			con.rollback();
		}
	}

}
