package com.hemendra.learning.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping(value="/products")
	public String firstControlHandler(){
		return "products";
	}
}
