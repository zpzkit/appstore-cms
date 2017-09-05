package com.mobvoi.appstore.cms.service.cms.impl;

import com.github.pagehelper.PageHelper;
import com.mobvoi.appstore.cms.dao.AppMap;
import com.mobvoi.appstore.cms.mapper.AppMapMapper;
import com.mobvoi.appstore.cms.service.cms.AppInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by watson on 2017/9/5.
 */
@Service
public class AppInfo implements AppInfoService<AppMap>{

  @Resource
  AppMapMapper appMapMapper;

  @Override
  public List<AppMap> getAppInfoDetail(int pageNum, int pageSize, boolean count) {
    PageHelper.startPage(pageNum, pageSize, count);
    return appMapMapper.selectAll();
  }
}
