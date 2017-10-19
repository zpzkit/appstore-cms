package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.WeeklyRecommend;

public interface WeeklyRecommendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeeklyRecommend record);

    int insertSelective(WeeklyRecommend record);

    WeeklyRecommend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeeklyRecommend record);

    int updateByPrimaryKey(WeeklyRecommend record);
}