package com.hp.dao;

import java.util.ArrayList;
import java.util.Date;

import com.hp.entity.StudentInfo;

public interface StudentInfoDao {
	//ȫ��
	ArrayList<StudentInfo> selectAll();
	//����
	int add(String sname,Integer sage,String sidcard,String sphoneno,Date addtime,String ssex);
	//ɾ��
	int delete(int id);
	/*//�޸�
	int update(StudentInfo studentInfo);*/

}
