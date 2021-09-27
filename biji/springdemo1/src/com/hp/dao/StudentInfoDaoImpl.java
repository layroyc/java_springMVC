package com.hp.dao;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hp.entity.StudentInfo;
@Repository
public class StudentInfoDaoImpl implements StudentInfoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public ArrayList<StudentInfo> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from studentinfo";
		ArrayList<StudentInfo> list= (ArrayList<StudentInfo>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<StudentInfo>(StudentInfo.class));
		return list;
	}

	@Override
	public int add(String sname, Integer sage, String sidcard, String sphoneno,
			Date addtime, String ssex) {
		// TODO Auto-generated method stub
		String sql = "insert into studentinfo(sname,sage,sidcard,sphoneno,addtime,ssex) values (?,?,?,?,?,?)";
		int i = jdbcTemplate.update(sql, sname,sage,sidcard,sphoneno,ssex);
		return i;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from studentinfo where id=?";
		int i = jdbcTemplate.update(sql, id);
		return i;
	}

}
