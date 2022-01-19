package ck;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class ConnectDBck {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement ps;
	public Connection connect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getConstructor().newInstance();
			String connectionUrl = "jdbc:sqlserver://DESKTOP-TM4S549\\SQLEXPRESS:1433;databaseName=Rental_Management;user=sa;password=123456789";
			conn = DriverManager.getConnection(connectionUrl);
			System.out.println("Connected...");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return conn;
	}
	
	
	public int executeDB(String sql) { //insert, update, delete
		int record=0;
		try {
			connect();
			stmt = conn.createStatement();
			record = stmt.executeUpdate(sql); //so luong hang thay doi sau khi thuc hien 1 trong 3 cau lenh tren
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return record;
	}
	
	public ResultSet listAll(String sql) {
		try {
			connect();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				//conn.close();
				//stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return rs;
	
	}


}
