package Javaproject_0306;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	//url
	static final String ORACLE_LOCAL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//connection
	public Connection getOracle()
	{
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(ORACLE_LOCAL, "angel","a1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클연결 실패"+e.getMessage());
		}
		
		return conn;
	}
	
	
	//close..select... 완성형sql(Statement)
	public void dbClose(ResultSet rs,Statement stmt,Connection conn)
	{
		try {
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	//close.... 완성형sql(Statement)
	public void dbClose(Statement stmt,Connection conn)
	{
		try {
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//close..select..미완성형sql(PrepareStatement)
	public void dbClose(ResultSet rs,PreparedStatement pstmt,Connection conn)
	{
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	//close... 완성형sql(PrepareStatement)
	public void dbClose(PreparedStatement pstmt,Connection conn)
	{
		try {
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
