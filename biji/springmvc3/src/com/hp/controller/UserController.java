package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.User;

@Controller
public class UserController {
	//自定义类型接收
	@RequestMapping("/us")
	public 	String us(User user){
		//请求参数的key（页面中name的值）与方法参数类型的属性名对应
		System.out.println(user);
		return "success";
	}
}
