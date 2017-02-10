package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {

	@RequestMapping("/")
	public ModelAndView showhomepage() 
	{
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("msg","welcome to shoppingcart");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView showloginpage() 
	{
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/registration")
	public ModelAndView showregistrationpage() 
	{
		ModelAndView mv=new ModelAndView("registration");
		return mv;
	}
}
