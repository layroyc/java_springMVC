package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HController {
	@RequestMapping("/say")
	public String say(){
		System.out.println("’‚¿Ô «hcontroller");
		return "index";
	}
}
