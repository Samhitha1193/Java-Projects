package com.samhitha.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeComtroller {
	@RequestMapping("home")
	public String home() {
		System.out.println("in controller");
		return "home";
	}
	

}
