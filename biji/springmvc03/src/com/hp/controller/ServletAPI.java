package com.hp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServletAPI {
	@RequestMapping("/sa")
	public String ServletA(HttpServletRequest request){
		request.setAttribute("name", "roy");
		return "index";
	}
}
