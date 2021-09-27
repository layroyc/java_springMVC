package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		//指定当前的类为控制器类
public class Hello {
	//使用注解将其映射到网络上
	@RequestMapping("/sayhi")	//相当于servlet中的url-pattern 
	public String sayhi(){
		System.out.println("欢迎到控制器层");
		//string类型 返回字符串
		return "index";

	}
	//访问:http://localhost:8080/项目名/sayhi(方法名)
}
