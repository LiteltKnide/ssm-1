package com.example.mapper;

import com.example.pojo.Bag;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BagMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Bag record);

    int insertSelective(Bag record);

    Bag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bag record);

    int updateByPrimaryKey(Bag record);
}