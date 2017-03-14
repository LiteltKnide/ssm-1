package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.annotations.Token;
import com.example.pojo.User;
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
	
	@RequestMapping("/login")
//	@Token(save=true)
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password){
		
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		boolean exsit = userService.isExsit(user);
		if (exsit) {
			System.out.println("Login Success" + username + password);
			return "user/success";
		}
		return "user/login";
	}
	
}
