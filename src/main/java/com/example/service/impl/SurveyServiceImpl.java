package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.SurveyMapper;
import com.example.pojo.Page;
import com.example.pojo.Survey;
import com.example.service.SurveyService;

@Service
public class SurveyServiceImpl extends BaseServiceImpl<Survey> implements SurveyService{

	@Autowired
	private SurveyMapper surveyMapper;

	@Override
	@Transactional(readOnly=true)
	public Page<Survey> getPage(String status, String pageNo, int userId) {
		
		Page<Survey> page = new Page<>();
		int nowpage = 1;
		try {
			nowpage = Integer.parseInt(pageNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int totalCount = surveyMapper.countAll(status, userId);
		page.setTotalCount(totalCount);
		page.setNowPage(nowpage);
		
		int offset = page.getPageSize() *(page.getNowPage() - 1);
		int limit = page.getPageSize();
		
		
		List<Survey> result = surveyMapper.selectAllByStatus(status, userId, offset, limit);
		page.setResult(result);
		
		return page;
	}
	
}
