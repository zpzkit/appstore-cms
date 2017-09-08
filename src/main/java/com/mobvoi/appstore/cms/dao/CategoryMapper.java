package com.mobvoi.appstore.cms.dao;

import com.mobvoi.appstore.cms.model.Category;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    @Select("select * from category")
    @ResultMap("BaseResultMap")
    List<Category> selectAll();
}