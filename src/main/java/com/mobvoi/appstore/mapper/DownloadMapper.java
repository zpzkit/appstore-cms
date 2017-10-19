package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.Download;
import com.mobvoi.appstore.model.DownloadKey;

public interface DownloadMapper {
    int deleteByPrimaryKey(DownloadKey key);

    int insert(Download record);

    int insertSelective(Download record);

    Download selectByPrimaryKey(DownloadKey key);

    int updateByPrimaryKeySelective(Download record);

    int updateByPrimaryKey(Download record);
}