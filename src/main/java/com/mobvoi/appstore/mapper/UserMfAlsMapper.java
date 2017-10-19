package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.UserMfAls;

public interface UserMfAlsMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserMfAls record);

    int insertSelective(UserMfAls record);

    UserMfAls selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserMfAls record);

    int updateByPrimaryKey(UserMfAls record);
}