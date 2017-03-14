package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.pojo.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void test(){
		System.out.println("UserService.test()");
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
	
	public boolean isExsit(User user){
		List<User> list = userMapper.queryByUAP(user);
		return list.size() > 0;
	}
}
