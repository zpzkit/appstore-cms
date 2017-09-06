package com.mobvoi.appstore.cms.service.cms.impl;

import com.github.pagehelper.PageHelper;
import com.mobvoi.appstore.cms.dao.ApkMapMapper;
import com.mobvoi.appstore.cms.dao.CommentsMapper;
import com.mobvoi.appstore.cms.dao.SupportWatchModelMapper;
import com.mobvoi.appstore.cms.model.*;
import com.mobvoi.appstore.cms.dao.AppMapMapper;
import com.mobvoi.appstore.cms.service.cms.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by watson on 2017/9/5.
 */
@Service
public class AppInfo implements AppInfoService<AppListModel>{

  @Autowired
  AppMapMapper appMapMapper;

  @Autowired
  ApkMapMapper apkMapMapper;

  @Autowired
  CommentsMapper commentsMapper;

  @Autowired
  SupportWatchModelMapper supportWatchModelMapper;

  @Override
  public List<AppListModel> getAppInfoDetail(int pageNum, int pageSize, boolean hasCount) {
    PageHelper.startPage(pageNum, pageSize, hasCount);
    List<AppListModel> appMaps = appMapMapper.selectAll();
    appMaps.forEach(app->{
      ApkMap apkMap = apkMapMapper.selectByAppid(app.getId());
      if (apkMap != null){
        app.setLastUpdateTime(apkMap.getUpdateTime());
        app.setCpu(apkMap.getCpu());
      }

      Integer commentsCount = commentsMapper.selectCommentsCountByAppid(app.getId());
      if (commentsCount != null){
        app.setCommentsCount(commentsCount);
      }

      SupportWatchModelKey supportWatchModelKey = supportWatchModelMapper.selectByAppid(app.getId());
      if (supportWatchModelKey != null) {
        app.setWatch(supportWatchModelKey.getWatch());
      }

    });
    return appMaps;
  }

  public void AppMapConvert(AppMap appMap, AppListModel appListModel) {
    appListModel.setId(appMap.getId());
    appListModel.setAliasName(appListModel.getAliasName());

  }
}
