package com.hp.Dao;

import com.hp.entity.User;

public interface UserDao {
  //µÇÂ¼
	public User selectByup(String uname,String upassword);
}
