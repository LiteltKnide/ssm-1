package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.BaseMapper;
import com.example.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T>{

	@Autowired
	private BaseMapper<T> baseMapper;
	
	@Override
//	@Transactional()
	public int deleteByPrimaryKey(Integer id) {
		return baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T t) {
		return baseMapper.insert(t);
	}

	@Override
	public int insertSelective(T t) {
		return baseMapper.insertSelective(t);
	}

	@Override
	public T selectByPrimaryKey(Integer id) {
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T t) {
		return baseMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int updateByPrimaryKey(T t) {
		return baseMapper.updateByPrimaryKey(t);
	}

}
