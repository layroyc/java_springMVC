package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.dao.AdminDao;
import com.hp.dao.AdminDaoImpl;
import com.hp.entity.Admin;

@Controller
public class RegistController {
	@RequestMapping("/regist1")
	public String regist(String username,String password){
		AdminDao dao=new AdminDaoImpl();
		Admin admin=new Admin(username,password);
		int i = dao.regist(admin);
		if(i>0){
			System.out.println("ע��ɹ�");
			return "redirect:/success.jsp";
		}else{
			System.out.println("ע��ʧ��");
			return "redirect:/regist.jsp";
		}

	}
	@RequestMapping("/regist2")
	public String regist2(String username,String password){
		//ע��
		if("admin".equals(username) && "123456".equals(password)){
			System.out.println("ע��ɹ���");
			return "redirect:/success.jsp";
		}else{
			System.out.println("ע��ʧ��");
			return "redirect:/regist.jsp";
		}

	}
}
