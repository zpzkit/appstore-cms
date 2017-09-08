package com.mobvoi.appstore.cms.service.cms.impl;

import com.github.pagehelper.PageHelper;
import com.mobvoi.appstore.cms.dao.*;
import com.mobvoi.appstore.cms.model.*;
import com.mobvoi.appstore.cms.service.cms.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
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

  @Autowired
  CategoryMapper categoryMapper;

  @Override
  public List<AppListModel> getAppInfoListDetail(int pageNum, int pageSize, boolean hasCount) {
    PageHelper.startPage(pageNum, pageSize, hasCount);
    List<AppListModel> appMaps = appMapMapper.selectAll();
    appMaps.forEach(app->{
      ApkMap apkMap = apkMapMapper.selectNewApkByAppid(app.getId());
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

  public AppListModel getAppInfoDetail(int appid){
    AppListModel appListModel = appMapMapper.selectOneByAppid(appid);

    ApkMap apkMap = apkMapMapper.selectNewApkByAppid(appid);
    appListModel.setCpu(apkMap.getCpu());
    appListModel.setLastUpdateTime(apkMap.getUpdateTime());

    Integer commentsCount = commentsMapper.selectCommentsCountByAppid(appid);
    if (commentsCount != null) {
      appListModel.setCommentsCount(commentsCount);
    }

    SupportWatchModelKey supportWatchModelKey = supportWatchModelMapper.selectByAppid(appid);
    appListModel.setWatch(supportWatchModelKey.getWatch());
    return appListModel;
  }

  public List<Category> getCategoryInfo(){
    List<Category> categories = categoryMapper.selectAll();
    return categories;
  }

  @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
  public int updateAppInfo(AppListModel appListModel){
    appMapMapper.updateByPrimaryKeySelective(appListModel);
    apkMapMapper.updateApkInfo(appListModel.getCpu(), appListModel.getId());
    supportWatchModelMapper.updatewatch(appListModel.getWatch(), appListModel.getId());
    return 0;
  }

  private ApkMap convertApkMap(AppListModel appListModel){
    ApkMap apkMap = new ApkMap();
    apkMap.setCpu(appListModel.getCpu());
    apkMap.setAppid(appListModel.getId());
    return apkMap;
  }

  private AppMap convertAppMap(AppListModel appListModel){
    AppMap appMap = new AppMap();
    appMap.setId(appListModel.getId());
    appMap.setAliasName(appListModel.getAliasName());
    appMap.setApkPackageName(appListModel.getApkPackageName());
    appMap.setAppFrom(appListModel.getAppFrom());
    appMap.setCategoryId(appListModel.getCategoryId());
    appMap.setCreateDate(appListModel.getCreateDate());
    appMap.setDescription(appListModel.getDescription());
    appMap.setDescriptionOrig(appListModel.getDescriptionOrig());
    appMap.setDeveloperId(appListModel.getDeveloperId());
    appMap.setDownloadCount(appListModel.getDownloadCount());
    appMap.setHardwareTips(appListModel.getHardwareTips());
    appMap.setIsDeleted(appListModel.getIsDeleted());
    appMap.setLogoUrl(appListModel.getLogoUrl());
    appMap.setName(appListModel.getName());
    appMap.setNeedPay(appListModel.getNeedPay());
    appMap.setOperateNote(appListModel.getOperateNote());
    appMap.setPrice(appListModel.getPrice());
    appMap.setRankScore(appListModel.getRankScore());
    appMap.setRecommendSimilar(appListModel.getRecommendSimilar());
    appMap.setScore(appListModel.getScore());
    appMap.setSecondCategoryId(appListModel.getSecondCategoryId());
    appMap.setShowInPhoneAppstore(appListModel.getShowInPhoneAppstore());
    appMap.setShowInWearAppstore(appListModel.getShowInWearAppstore());
    appMap.setSummary(appListModel.getSummary());
    appMap.setSupportHardware(appListModel.getSupportHardware());
    appMap.setTags(appListModel.getTags());
    appMap.setThirdCategoryId(appListModel.getThirdCategoryId());
    appMap.setWearStandalone(appListModel.getWearStandalone());

    return appMap;
  }

}
