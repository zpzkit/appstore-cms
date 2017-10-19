package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.AppTag;
import com.mobvoi.appstore.model.AppTagKey;

public interface AppTagMapper {
    int deleteByPrimaryKey(AppTagKey key);

    int insert(AppTag record);

    int insertSelective(AppTag record);

    AppTag selectByPrimaryKey(AppTagKey key);

    int updateByPrimaryKeySelective(AppTag record);

    int updateByPrimaryKey(AppTag record);
}