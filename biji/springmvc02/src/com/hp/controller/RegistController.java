package com.hp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistController {
	@RequestMapping("/regist")
	public String regist(@RequestParam(value="name",required=false,defaultValue="rr")String username,String password,Integer age){
		System.out.println("用户名："+username+"密码："+password+"年龄："+age);
		return "success";
	}
	@RequestMapping("/regist2")
	public String login(String username,String password,String age){
		//注册
		if("admin".equals(username) && "123456".equals(password) && "19".equals(age)){
			System.out.println("注册成功！");
			return "redirect:/success.jsp";
		}else{
			System.out.println("注册失败");
			return "redirect:/regist.jsp";
		}

	}
}
