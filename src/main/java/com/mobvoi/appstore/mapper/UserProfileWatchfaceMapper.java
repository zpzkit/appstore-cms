package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.UserProfileWatchface;

public interface UserProfileWatchfaceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserProfileWatchface record);

    int insertSelective(UserProfileWatchface record);

    UserProfileWatchface selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserProfileWatchface record);

    int updateByPrimaryKey(UserProfileWatchface record);
}