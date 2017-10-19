package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.SupportWatchModelKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SupportWatchModelMapper {
    int deleteByPrimaryKey(SupportWatchModelKey key);

    int insert(SupportWatchModelKey record);

    int insertSelective(SupportWatchModelKey record);

    @Select("select * from support_watch_model where appid = #{appid}")
    @ResultMap("BaseResultMap")
    SupportWatchModelKey selectByAppid(@Param("appid") int appid);

    @Update("update support_watch_model set watch = #{watch} where appid = #{appid}")
    int updatewatch(@Param("watch") String watch, @Param("appid") int appid);
}