package com.hp.controller;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateControlly {
	@RequestMapping("/paramdate")
	public String paramdate(@DateTimeFormat(pattern="yyyy-MM-dd")Date birthday){
		//springmvc默认接收日期类型格式必须是：yyyy/MM/dd
		//自定义接收日期类型格式@DateTimeFormat(pattern="yyyy-MM-dd") --指定日期类型格式
		System.out.println(birthday);
		return "success";
	}

}
