package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.TblApk;

public interface TblApkMapper {
    int insert(TblApk record);

    int insertSelective(TblApk record);
}