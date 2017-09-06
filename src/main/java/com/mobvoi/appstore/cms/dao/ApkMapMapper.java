package com.mobvoi.appstore.cms.dao;

import com.mobvoi.appstore.cms.model.ApkMap;
import com.mobvoi.appstore.cms.model.ApkMapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ApkMapMapper {
    int deleteByPrimaryKey(ApkMapKey key);

    int insert(ApkMap record);

    int insertSelective(ApkMap record);

    ApkMap selectByPrimaryKey(ApkMapKey key);

    int updateByPrimaryKeySelective(ApkMap record);

    int updateByPrimaryKey(ApkMap record);

    @Select("select * from apk where appid = #{appid}")
    ApkMap selectByAppid(@Param("appid") int appid);
}