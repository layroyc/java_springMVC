package com.hp.dao;

import java.util.ArrayList;
import java.util.Date;

import com.hp.entity.StudentInfo;

public interface StudentInfoDao {
	//全查
	ArrayList<StudentInfo> selectAll();
	//新增
	int add(String sname,Integer sage,String sidcard,String sphoneno,Date addtime,String ssex);
	//删除
	int delete(int id);
	/*//修改
	int update(StudentInfo studentInfo);*/

}
