package com.petzapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	

	@RequestMapping("/")
	public String form(){
		return "index";
	}
	
}
