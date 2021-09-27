package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/say",method={RequestMethod.POST})	//相当于工作空间  必须经过
public class HController {
	@RequestMapping("/sayhello")	//相当于 url-pattern
	public String HelloController(){
		System.out.println("this is Controller");
		//返回字符串
		return "index";	//跳转处理   /index.jsp
	}

	@RequestMapping("/wy")
	public String wy(){
		System.out.println("this is wy");
		/*
		//请求转发     地址栏不变
		//1.转发跳转到指定资源
		//return "forward:/index.jsp";	//此时不再通过视图解析器陪陪前缀和后缀
		//2.转发跳转到指定资源
		//return "forward:/say/sayhello";
		 */
		//请求重定向     地址栏发生改变
		//1.请求重定向跳转到指定资源
		return "redirect:/index.jsp";	
		//2.请求重定向跳转到指定资源
		//return "redirect:/say/sayhello";

	}

}
