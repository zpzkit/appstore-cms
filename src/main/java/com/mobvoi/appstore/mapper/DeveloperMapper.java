package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.Developer;

public interface DeveloperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Developer record);

    int insertSelective(Developer record);

    Developer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Developer record);

    int updateByPrimaryKey(Developer record);
}