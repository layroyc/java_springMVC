package com.hp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="/login")
	public String login(HttpServletRequest request){
		//��ȡ����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//��¼��֤
		if("admin".equals(username) && "123456".equals(password)){
			System.out.println("��¼�ɹ�");
			return "redirect:/success.jsp";
		}else{
			System.out.println("��¼ʧ��");
			return "redirect:/login.jsp";
		}
	}
}
