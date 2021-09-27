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
		//list����Ԫ����String����,������list����ǰָ��ע��@RequestParam
		for(String hobby:hobbys){
			System.out.println(hobby);
		}
		return "success";
	}
	
	//�����Զ���������� 
	@RequestMapping("/paramlist2")
	private String paramlist2(UserDTO userDTO){
		//list�����д洢�Զ������ͣ�User�� ÿһ��Ԫ�ؾ���һ��User����
		//list�л�ȡ��һ��Ԫ�أ�users[0]
		List<User> users = userDTO.getUsers();
		for(User user:users){
			System.out.println(user);
		}
		return "success";
	}
}
