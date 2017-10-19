package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.BannerShowCount;

public interface BannerShowCountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BannerShowCount record);

    int insertSelective(BannerShowCount record);

    BannerShowCount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BannerShowCount record);

    int updateByPrimaryKey(BannerShowCount record);
}