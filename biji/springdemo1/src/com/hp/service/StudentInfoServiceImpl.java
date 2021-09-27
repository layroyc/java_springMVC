package com.hp.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.StudentInfoDao;
import com.hp.entity.StudentInfo;
@Service
public class StudentInfoServiceImpl implements StudentInfoService{
	@Autowired
	private StudentInfoDao studentInfoDao;
	@Override
	public ArrayList<StudentInfo> selectAll() {
		// TODO Auto-generated method stub
		//调用dao中的全查方法
		ArrayList<StudentInfo> list =studentInfoDao.selectAll();
		return list;
	}

	@Override
	public int add(String sname, Integer sage, String sidcard, String sphoneno,
			Date addtime, String ssex) {
		// TODO Auto-generated method stub
		int i = studentInfoDao.add(sname, sage, sidcard, sphoneno, addtime, ssex);
		return i;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int i = studentInfoDao.delete(id);
		return i;
	}

}
