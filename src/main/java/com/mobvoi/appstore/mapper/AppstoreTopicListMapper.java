package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.AppstoreTopicList;

public interface AppstoreTopicListMapper {
    int deleteByPrimaryKey(Integer topicId);

    int insert(AppstoreTopicList record);

    int insertSelective(AppstoreTopicList record);

    AppstoreTopicList selectByPrimaryKey(Integer topicId);

    int updateByPrimaryKeySelective(AppstoreTopicList record);

    int updateByPrimaryKey(AppstoreTopicList record);
}