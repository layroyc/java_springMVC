package com.hp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hp.entity.User;
@Repository	//创建dao接口实现类对象
public class UserDaoImpl implements UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public User selectUP(String uname, String upassword) {
		// TODO Auto-generated method stub
		String sql = "select * from user where uname=? and upassword=?";
		User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),uname,upassword);
		
		return user;
	}
}
