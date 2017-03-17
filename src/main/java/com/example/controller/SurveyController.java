package com.example.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.exceptions.FileIsNotImgException;
import com.example.pojo.Survey;
import com.example.pojo.User;
import com.example.service.SurveyService;
import com.example.utils.DateUtils;
import com.example.utils.ImgUtil;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	private static final String DEFUALT_PATH="static/image/daoMain.png";

	@Autowired
	private SurveyService surveyService;
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String newSurvey(Survey survey ,
			@RequestParam("file") MultipartFile file,
			HttpServletRequest request,
			HttpSession session) throws IOException{
		String path = DEFUALT_PATH;
		String filename = file.getOriginalFilename();
		if (file != null && filename != null && filename.length() > 0) {
			
			String contentType = file.getContentType();
			if (!contentType.startsWith("image")) {
				throw new FileIsNotImgException("请上传图片!");
			}
			
			InputStream inputStream = file.getInputStream();
			String realPath = request.getRealPath("/surveyLogo");
			System.out.println("图片logo路径 = "+realPath);
			path = ImgUtil.resizeImages(inputStream, realPath);
		}
		User loginUser = (User) session.getAttribute("loginUser");
		
		survey.setUserId(loginUser.getId());
		survey.setLogoPath(path);
		survey.setCreateTime(DateUtils.curDateStr8());
		survey.setStatus("0");
//		System.out.println(survey);
		surveyService.insert(survey);
		
		return "user/success";
	}
	
}
