package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.User;

@Controller
public class UserController {
	//�Զ������ͽ���
	@RequestMapping("/us")
	public 	String us(User user){
		//���������key��ҳ����name��ֵ���뷽���������͵���������Ӧ
		System.out.println(user);
		return "success";
	}
}
