package com.hp.dao;

import com.hp.entity.User;

public interface UserDao {
	//µÇÂ¼
	User selectUP(String uname,String upassword);
	
}
