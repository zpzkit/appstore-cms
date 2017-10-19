package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.AppRecommend;

public interface AppRecommendMapper {
    int insert(AppRecommend record);

    int insertSelective(AppRecommend record);
}