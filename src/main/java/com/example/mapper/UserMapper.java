package com.example.mapper;

import com.example.pojo.User;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	
	int insert(User user);

    User selectByPrimaryKey(Integer id);

    List<User> queryByUAP(User user);
}