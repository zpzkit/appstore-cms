package com.mobvoi.appstore.cms.mapper;

import com.mobvoi.appstore.cms.dao.AppMap;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AppMapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppMap record);

    int insertSelective(AppMap record);

    AppMap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppMap record);

    int updateByPrimaryKey(AppMap record);

    @Select("select * from app")
    @ResultMap("BaseResultMap")
    List<AppMap> selectAll();

}