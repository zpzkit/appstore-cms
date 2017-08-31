package com.mobvoi.appstore.cms.dao;

import com.mobvoi.appstore.cms.model.appMap;

public interface appMapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(appMap record);

    int insertSelective(appMap record);

    appMap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(appMap record);

    int updateByPrimaryKey(appMap record);
}