package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.User;

@Controller
public class UserController {
	//自定义类型接收
	@RequestMapping("/paramuser")
	public String paramuser(User user){
		System.out.println(user);
		return "success";
	}
}
