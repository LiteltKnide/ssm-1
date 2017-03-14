package com.example.mapper;

import com.example.pojo.User;
import com.example.pojo.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User selectByPrimaryKey(Integer id);

    List<User> queryByUAP(User user);
}