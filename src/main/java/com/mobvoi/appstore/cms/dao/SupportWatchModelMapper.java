package com.mobvoi.appstore.cms.dao;

import com.mobvoi.appstore.cms.model.SupportWatchModelKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface SupportWatchModelMapper {
    int deleteByPrimaryKey(SupportWatchModelKey key);

    int insert(SupportWatchModelKey record);

    int insertSelective(SupportWatchModelKey record);

    @Select("select * from support_watch_model where appid = #{appid}")
    @ResultMap("BaseResultMap")
    SupportWatchModelKey selectByAppid(@Param("appid") int appid);
}