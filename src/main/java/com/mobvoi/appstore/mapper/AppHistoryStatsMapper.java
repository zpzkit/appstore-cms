package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.AppHistoryStats;

public interface AppHistoryStatsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppHistoryStats record);

    int insertSelective(AppHistoryStats record);

    AppHistoryStats selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppHistoryStats record);

    int updateByPrimaryKey(AppHistoryStats record);
}