package com.hp.service;

import java.util.ArrayList;
import java.util.Date;

import com.hp.entity.StudentInfo;

public interface StudentInfoService {
	//全查
	ArrayList<StudentInfo> selectAll();
	//新增
	int add(String sname,Integer sage,String sidcard,String sphoneno,Date addtime,String ssex);
	//删除
	int delete(int id);

}
