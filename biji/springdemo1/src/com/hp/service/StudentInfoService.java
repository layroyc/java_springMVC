package com.hp.service;

import java.util.ArrayList;
import java.util.Date;

import com.hp.entity.StudentInfo;

public interface StudentInfoService {
	//ȫ��
	ArrayList<StudentInfo> selectAll();
	//����
	int add(String sname,Integer sage,String sidcard,String sphoneno,Date addtime,String ssex);
	//ɾ��
	int delete(int id);

}
