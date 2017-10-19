package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.HotQuery;

public interface HotQueryMapper {
    int deleteByPrimaryKey(Integer time);

    int insert(HotQuery record);

    int insertSelective(HotQuery record);

    HotQuery selectByPrimaryKey(Integer time);

    int updateByPrimaryKeySelective(HotQuery record);

    int updateByPrimaryKeyWithBLOBs(HotQuery record);
}