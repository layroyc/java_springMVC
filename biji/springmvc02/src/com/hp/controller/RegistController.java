package com.hp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistController {
	@RequestMapping("/regist")
	public String regist(@RequestParam(value="name",required=false,defaultValue="rr")String username,String password,Integer age){
		System.out.println("�û�����"+username+"���룺"+password+"���䣺"+age);
		return "success";
	}
	@RequestMapping("/regist2")
	public String login(String username,String password,String age){
		//ע��
		if("admin".equals(username) && "123456".equals(password) && "19".equals(age)){
			System.out.println("ע��ɹ���");
			return "redirect:/success.jsp";
		}else{
			System.out.println("ע��ʧ��");
			return "redirect:/regist.jsp";
		}

	}
}
