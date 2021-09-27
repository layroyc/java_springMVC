package com.hp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.User;
import com.hp.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
  @RequestMapping("/login")
  public String login(String uname,String upassword){
	  System.out.println(uname+"---"+upassword);
	User user=userService.login(uname, upassword);
	  if(user != null){
		  System.out.println("��¼�ɹ�");
		  return "redirect:/quancha.jsp";
	  }else{
		  System.out.println("��¼ʧ��");
	     return "redirect:/login.jsp";
	  }
  }
}
