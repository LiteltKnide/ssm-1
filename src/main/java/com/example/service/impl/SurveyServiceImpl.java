package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.SurveyMapper;
import com.example.pojo.Survey;
import com.example.service.SurveyService;

@Service
public class SurveyServiceImpl extends BaseServiceImpl<Survey> implements SurveyService{

	@Autowired
	private SurveyMapper surveyMapper;
	
}
