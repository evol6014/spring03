package com.example.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CountryDao {

	static Log log = LogFactory.getLog(CountryDao.class);
	
	BasicDataSource ds;
	public void setDataSource(BasicDataSource ds) {
		this.ds = ds;
	}
	
	public List<String> selectAll() throws SQLException {
		
		Connection con = ds.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select name from country where continent=?");
		pstmt.setString(1, "Europe");
		
		ResultSet rs = pstmt.executeQuery();
		
		List<String> list = new ArrayList<>();
		while(rs.next()) {
			list.add(rs.getString("name"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return list;
	}
	
}
