package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.ItmMfAls;

public interface ItmMfAlsMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItmMfAls record);

    int insertSelective(ItmMfAls record);

    ItmMfAls selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItmMfAls record);

    int updateByPrimaryKey(ItmMfAls record);
}