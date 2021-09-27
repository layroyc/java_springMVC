package com.hp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.UserDao;
import com.hp.entity.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User login(String uname, String upassword) {
		// TODO Auto-generated method stub
		User user = userDao.selectUP(uname, upassword);
		return user;
	}

}
