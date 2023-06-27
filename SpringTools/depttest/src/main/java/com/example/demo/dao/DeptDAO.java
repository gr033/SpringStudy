package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demo.vo.DeptVO;

@Repository
public class DeptDAO {
	
	public ArrayList<DeptVO> findAll(){
		String sql = "select * from dept";
		ArrayList<DeptVO> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","c##madang","madang");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				DeptVO d = new DeptVO();
				d.setDno(rs.getInt(1));
				d.setDname(rs.getString(2));
				d.setDloc(rs.getString(3));
				list.add(d);
			}
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("findAll error: "+e.getMessage());
		}
		return list;
	}
}
