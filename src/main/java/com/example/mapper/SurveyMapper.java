package com.example.mapper;

import com.example.pojo.Survey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Survey record);

    int insertSelective(Survey record);

    Survey selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Survey record);

    int updateByPrimaryKey(Survey record);
}