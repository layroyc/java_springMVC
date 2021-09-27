package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/say",method={RequestMethod.POST})	//�൱�ڹ����ռ�  ���뾭��
public class HController {
	@RequestMapping("/sayhello")	//�൱�� url-pattern
	public String HelloController(){
		System.out.println("this is Controller");
		//�����ַ���
		return "index";	//��ת����   /index.jsp
	}

	@RequestMapping("/wy")
	public String wy(){
		System.out.println("this is wy");
		/*
		//����ת��     ��ַ������
		//1.ת����ת��ָ����Դ
		//return "forward:/index.jsp";	//��ʱ����ͨ����ͼ����������ǰ׺�ͺ�׺
		//2.ת����ת��ָ����Դ
		//return "forward:/say/sayhello";
		 */
		//�����ض���     ��ַ�������ı�
		//1.�����ض�����ת��ָ����Դ
		return "redirect:/index.jsp";	
		//2.�����ض�����ת��ָ����Դ
		//return "redirect:/say/sayhello";

	}

}
