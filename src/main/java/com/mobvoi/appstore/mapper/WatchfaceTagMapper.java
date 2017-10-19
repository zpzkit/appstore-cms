package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.WatchfaceTag;

public interface WatchfaceTagMapper {
    int insert(WatchfaceTag record);

    int insertSelective(WatchfaceTag record);
}