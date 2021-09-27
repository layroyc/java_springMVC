package com.hp.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hp.entity.User;
@Repository
public class UserDaoImp implements UserDao{
	@Autowired
     private JdbcTemplate jdbcTemplate;
	@Override
	public User selectByup(String uname, String upassword) {
		// TODO Auto-generated method stub
		String sql="select * from user where uname=? and upassword=?";
		User user=jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), uname,upassword);
		return user;
	}

}
