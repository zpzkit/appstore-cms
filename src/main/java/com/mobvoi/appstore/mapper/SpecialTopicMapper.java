package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.SpecialTopic;

public interface SpecialTopicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpecialTopic record);

    int insertSelective(SpecialTopic record);

    SpecialTopic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpecialTopic record);

    int updateByPrimaryKey(SpecialTopic record);
}