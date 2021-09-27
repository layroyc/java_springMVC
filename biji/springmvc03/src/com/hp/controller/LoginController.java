package com.hp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="/login")
	public String login(HttpServletRequest request){
		//获取参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//登录验证
		if("admin".equals(username) && "123456".equals(password)){
			System.out.println("登录成功");
			return "redirect:/success.jsp";
		}else{
			System.out.println("登录失败");
			return "redirect:/login.jsp";
		}
	}
}
