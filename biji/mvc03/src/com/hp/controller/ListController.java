package com.hp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hp.entity.User;
import com.hp.entity.UserDTO;

@Controller
public class ListController {
	@RequestMapping("/paramlist")
	private String paramlist(@RequestParam()List<String> hobbys){
		//list集合元素是String类型,必须在list类型前指定注解@RequestParam
		for(String hobby:hobbys){
			System.out.println(hobby);
		}
		return "success";
	}
	
	//接收自定义对象类型 
	@RequestMapping("/paramlist2")
	private String paramlist2(UserDTO userDTO){
		//list集合中存储自定义类型（User） 每一个元素就是一个User对象
		//list中获取第一个元素：users[0]
		List<User> users = userDTO.getUsers();
		for(User user:users){
			System.out.println(user);
		}
		return "success";
	}
}
