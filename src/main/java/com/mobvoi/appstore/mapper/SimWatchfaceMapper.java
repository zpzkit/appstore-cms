package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.SimWatchface;

public interface SimWatchfaceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SimWatchface record);

    int insertSelective(SimWatchface record);

    SimWatchface selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SimWatchface record);

    int updateByPrimaryKey(SimWatchface record);
}