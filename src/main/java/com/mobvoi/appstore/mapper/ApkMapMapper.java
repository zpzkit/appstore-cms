package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.ApkMap;
import com.mobvoi.appstore.model.ApkMapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ApkMapMapper {
    int deleteByPrimaryKey(ApkMapKey key);

    int insert(ApkMap record);

    int insertSelective(ApkMap record);

    ApkMap selectByPrimaryKey(ApkMapKey key);

    int updateByPrimaryKeySelective(ApkMap record);

    int updateByPrimaryKey(ApkMap record);

    @Select("select * from apk where appid = #{appid} order by update_time desc limit 1")
    ApkMap selectNewApkByAppid(@Param("appid") int appid);

    @Update("update apk set cpu = #{cpu} where appid = #{appid}")
    int updateApkInfo(@Param("cpu") String cpu, @Param("appid") int appid);
}