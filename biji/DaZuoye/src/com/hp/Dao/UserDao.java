package com.hp.Dao;

import com.hp.entity.User;

public interface UserDao {
  //��¼
	public User selectByup(String uname,String upassword);
}
