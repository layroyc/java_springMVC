package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		//ָ����ǰ����Ϊ��������
public class Hello {
	//ʹ��ע�⽫��ӳ�䵽������
	@RequestMapping("/sayhi")	//�൱��servlet�е�url-pattern 
	public String sayhi(){
		System.out.println("��ӭ����������");
		//string���� �����ַ���
		return "index";

	}
	//����:http://localhost:8080/��Ŀ��/sayhi(������)
}
