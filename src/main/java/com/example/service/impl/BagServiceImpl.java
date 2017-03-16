package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.BagMapper;
import com.example.pojo.Bag;
import com.example.service.BagService;

@Service
public class BagServiceImpl extends BaseServiceImpl<Bag> implements BagService{

	@Autowired
	private BagMapper bagMapper;
	
}
