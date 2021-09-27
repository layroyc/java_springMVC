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
		System.out.println("�û�����"+username+"���룺"+password+"���䣺"+age);
		return "success";
	}
	@RequestMapping("/regist2")
    public String regist2(String username,String password,Integer age){
	 //ע��
	 if(username!=null && password!=null && age!=null){
		 System.out.println("ע��ɹ���");
		 return "success";
	 }else{
		 System.out.println("ע��ʧ��");
		 return "regist";
	 }
		
    }
	
	//�Զ������ͽ���
	/*@RequestMapping("/regist3")
    public String regist3(Admin admin){
		//���������key��ҳ����name��ֵ���뷽���������͵���������Ӧ
		System.out.println(admin);
		return "success";
	 
    }*/
	//������������
	@RequestMapping("/paramDate")
    public String paramDate(@DateTimeFormat(pattern="yyyy-MM-dd")Date birth){
		System.out.println(birth);
		return "success";
	 
    }
	
	//����list����
	@RequestMapping("/paramList")
    public String paramList(@RequestParam()List<String> hobbys){
		for (String hobby : hobbys) {
			System.out.println(hobby);
		}
		return "success";
	 
    }
	//�����Զ����������   list����
	/*@RequestMapping("/paramList2")
    public String paramList2(AdminDTO adminDTO ){
		List<Admin> admins = adminDTO.getAdmins();
		for(Admin admin:admins){
			System.out.println(admin);
		}
		return "success";
	 
    }*/
}
