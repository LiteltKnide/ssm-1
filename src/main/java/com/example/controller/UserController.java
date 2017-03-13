package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/query")
	public String test(){
		System.out.println("this user is NO.1");
		userService.test();
		return "test/list";
	}
	
//	@RequestMapping("/login")
//	public String login(){
//		
//		return "user/login";
//	}
	
}
