package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.SpecialTopicContent;
import com.mobvoi.appstore.model.SpecialTopicContentKey;

public interface SpecialTopicContentMapper {
    int deleteByPrimaryKey(SpecialTopicContentKey key);

    int insert(SpecialTopicContent record);

    int insertSelective(SpecialTopicContent record);

    SpecialTopicContent selectByPrimaryKey(SpecialTopicContentKey key);

    int updateByPrimaryKeySelective(SpecialTopicContent record);

    int updateByPrimaryKey(SpecialTopicContent record);
}