package com.hemendra.learning.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/first-cntrl")
public class FirstController {
	@RequestMapping(value = "/data")
	public String firstControlHandler(){
		return "home";
	}
	

}
