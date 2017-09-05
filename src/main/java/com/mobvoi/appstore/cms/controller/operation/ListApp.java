package com.mobvoi.appstore.cms.controller.operation;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mobvoi.appstore.cms.dao.AppMap;
import com.mobvoi.appstore.cms.mapper.AppMapMapper;
import com.mobvoi.appstore.cms.service.cms.impl.AppInfo;
import com.mobvoi.appstore.cms.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhang (pengzhang@mobvoi.com)on 2017/8/30.
 */
@RestController
@RequestMapping("appstore/cms")
public class ListApp {

  @Resource
  AppInfo appInfo;

  @RequestMapping("list")
  @RequiresPermissions("appstore:cms:common:list")
  public R cmslist(Integer pageNum, Integer pageSize, String platform) {
    List<AppMap> appInfoDetail = appInfo.getAppInfoDetail(pageNum, pageSize, true);
    PageInfo<AppMap> pageInfo = new PageInfo<AppMap>(appInfoDetail);
    pageInfo.setList(appInfoDetail);

    return R.ok().put("page", pageInfo);
  }
}
