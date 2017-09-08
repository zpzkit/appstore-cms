package com.mobvoi.appstore.cms.dao;

import com.mobvoi.appstore.cms.model.Comments;
import com.mobvoi.appstore.cms.model.CommentsKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface CommentsMapper {
    int deleteByPrimaryKey(CommentsKey key);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(CommentsKey key);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);

    @Select("select * from comments where appid = #{appid}")
    @ResultMap("BaseResultMap")
    Comments selectOneByAppid(@Param("appid") int appid);

    @Select("select count(*) from comments where appid = #{appid}")
    Integer selectCommentsCountByAppid(@Param("appid") int appid);
}