package com.hp.controller;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateControlly {
	@RequestMapping("/paramdate")
	public String paramdate(@DateTimeFormat(pattern="yyyy-MM-dd")Date birthday){
		//springmvcĬ�Ͻ����������͸�ʽ�����ǣ�yyyy/MM/dd
		//�Զ�������������͸�ʽ@DateTimeFormat(pattern="yyyy-MM-dd") --ָ���������͸�ʽ
		System.out.println(birthday);
		return "success";
	}

}
