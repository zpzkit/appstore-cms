package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.UserRecApps;

public interface UserRecAppsMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserRecApps record);

    int insertSelective(UserRecApps record);

    UserRecApps selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserRecApps record);

    int updateByPrimaryKey(UserRecApps record);
}