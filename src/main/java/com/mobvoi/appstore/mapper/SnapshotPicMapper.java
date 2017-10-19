package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.SnapshotPic;

public interface SnapshotPicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SnapshotPic record);

    int insertSelective(SnapshotPic record);

    SnapshotPic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SnapshotPic record);

    int updateByPrimaryKey(SnapshotPic record);
}