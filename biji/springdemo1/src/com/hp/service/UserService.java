package com.hp.service;

import com.hp.entity.User;

public interface UserService {
	User login(String uname,String upassword);
}
