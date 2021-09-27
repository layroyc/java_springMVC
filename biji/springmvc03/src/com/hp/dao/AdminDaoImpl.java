package com.hp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hp.entity.Admin;
import com.hp.util.DBHelper;

public class AdminDaoImpl implements AdminDao{

	@Override
	public int regist(Admin admin) {
		Connection conn = null;
		PreparedStatement ps = null;
		int i = 0;
		try {
			conn = DBHelper.getConn();
			String sql = "insert into admin(id,username,password) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,admin.getId());
			ps.setString(2, admin.getUsername());
			ps.setString(3, admin.getPassword());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DBHelper.close(ps, conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}

}
