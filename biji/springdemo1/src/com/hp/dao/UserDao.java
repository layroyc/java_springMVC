package com.hp.dao;

import com.hp.entity.User;

public interface UserDao {
	//��¼
	User selectUP(String uname,String upassword);
	
}
