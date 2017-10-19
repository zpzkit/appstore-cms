package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.AwHotQuery;

public interface AwHotQueryMapper {
    int insert(AwHotQuery record);

    int insertSelective(AwHotQuery record);
}