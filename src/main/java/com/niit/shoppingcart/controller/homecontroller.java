package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {

	@RequestMapping("/")
	public String showhomepage() {
		return "home";
	}

}
