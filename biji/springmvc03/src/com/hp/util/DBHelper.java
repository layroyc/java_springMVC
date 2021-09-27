package com.hp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DBHelper {
	private static Properties pr = new Properties();
	static{
		InputStream in =DBHelper.class.getResourceAsStream("/jdbc.properties");
		try {
			pr.load(in);
			Class.forName(pr.getProperty("driver"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConn() throws SQLException{
		Connection conn = DriverManager.getConnection(pr.getProperty("url"),pr.getProperty("username"),pr.getProperty("password"));
		return conn;
		
	}
	//’Î∂‘≤È—Ø
	public static void close(PreparedStatement ps,ResultSet rs,Connection conn) throws SQLException{
		if(ps!=null) ps.close();
		if(rs!=null) rs.close();
		if(conn!=null) conn.close();
	}
	public static void close(PreparedStatement ps,Connection conn) throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	public static void main(String[] args) throws SQLException {
		System.out.println(DBHelper.getConn());
	}
	
}
