package com.hp.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.format.annotation.DateTimeFormat;
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
    public String regist2(String username,String password,Integer age){
	 //注册
	 if(username!=null && password!=null && age!=null){
		 System.out.println("注册成功！");
		 return "success";
	 }else{
		 System.out.println("注册失败");
		 return "regist";
	 }
		
    }
	
	//自定义类型接收
	/*@RequestMapping("/regist3")
    public String regist3(Admin admin){
		//请求参数的key（页面中name的值）与方法参数类型的属性名对应
		System.out.println(admin);
		return "success";
	 
    }*/
	//接收日期类型
	@RequestMapping("/paramDate")
    public String paramDate(@DateTimeFormat(pattern="yyyy-MM-dd")Date birth){
		System.out.println(birth);
		return "success";
	 
    }
	
	//接收list集合
	@RequestMapping("/paramList")
    public String paramList(@RequestParam()List<String> hobbys){
		for (String hobby : hobbys) {
			System.out.println(hobby);
		}
		return "success";
	 
    }
	//接收自定义对象类型   list集合
	/*@RequestMapping("/paramList2")
    public String paramList2(AdminDTO adminDTO ){
		List<Admin> admins = adminDTO.getAdmins();
		for(Admin admin:admins){
			System.out.println(admin);
		}
		return "success";
	 
    }*/
}
