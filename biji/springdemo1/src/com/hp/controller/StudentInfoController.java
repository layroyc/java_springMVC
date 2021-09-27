package com.hp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.StudentInfo;
import com.hp.service.StudentInfoService;

@Controller
@RequestMapping("/studentInfo")
public class StudentInfoController {
	@Autowired
	private StudentInfoService studentInfoService;
	@RequestMapping("/queryAll")
	public String queryAll(){
		ArrayList<StudentInfo> sf = studentInfoService.selectAll();
		for (StudentInfo studentInfo : sf) {
			System.out.println(studentInfo);
		}
		return "redirect:/queryAll.jsp";
	}

}
