package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.RecSimApps;

public interface RecSimAppsMapper {
    int insert(RecSimApps record);

    int insertSelective(RecSimApps record);
}