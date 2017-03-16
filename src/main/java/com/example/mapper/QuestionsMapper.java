package com.example.mapper;

import com.example.pojo.Questions;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Questions record);

    int insertSelective(Questions record);

    Questions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);
}