package com.example.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.annotations.Token;
import com.example.pojo.User;
import com.example.service.UserService;
import com.thoughtworks.xstream.core.MapBackedDataHolder;

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
			@RequestParam("password") String password,
			HttpSession session, Map<String, Object> map){
		
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		User loginUser = userService.isExsit(user);
		System.out.println(loginUser);
		if (loginUser != null) {
			System.out.println("Login Success" + username + password);
			session.setAttribute("LoginUser", loginUser);
			return "user/success";
		}
		map.put("msg", "用户名密码错误！");
		return "user/login";
	}
	
}
