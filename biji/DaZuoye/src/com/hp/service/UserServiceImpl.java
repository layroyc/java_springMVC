package com.hp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.Dao.UserDao;
import com.hp.entity.User;
@Service
public class UserServiceImpl implements UserService{
      //��Ϊ���� ����ע��
	@Autowired
	private UserDao userDao;
	@Override
	public User login(String uname, String upassword) {
		// TODO Auto-generated method stub
		User user=userDao.selectByup(uname, upassword);
		return user;
	}

}
