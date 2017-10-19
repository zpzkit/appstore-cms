package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.AppRecSim;

public interface AppRecSimMapper {
    int insert(AppRecSim record);

    int insertSelective(AppRecSim record);
}