package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.Thumbnails;

public interface ThumbnailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Thumbnails record);

    int insertSelective(Thumbnails record);

    Thumbnails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Thumbnails record);

    int updateByPrimaryKey(Thumbnails record);
}