package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.AppOrder;

public interface AppOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(AppOrder record);

    int insertSelective(AppOrder record);

    AppOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AppOrder record);

    int updateByPrimaryKey(AppOrder record);
}