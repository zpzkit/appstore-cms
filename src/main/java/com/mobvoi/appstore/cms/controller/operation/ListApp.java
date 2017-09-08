package com.mobvoi.appstore.cms.controller.operation;

import com.github.pagehelper.PageInfo;
import com.mobvoi.appstore.cms.model.AppListModel;
import com.mobvoi.appstore.cms.model.AppMap;
import com.mobvoi.appstore.cms.model.Category;
import com.mobvoi.appstore.cms.service.cms.impl.AppInfo;
import com.mobvoi.appstore.cms.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    List<AppListModel> appInfoDetail = appInfo.getAppInfoListDetail(pageNum, pageSize, true);
    PageInfo<AppListModel> pageInfo = new PageInfo<AppListModel>(appInfoDetail);
    pageInfo.setList(appInfoDetail);

    return R.ok().put("page", pageInfo);
  }

  @RequestMapping("appInfo/{appid}")
  @RequiresPermissions("appstore:cms:appInfo")
  public R getAppInfoById(@PathVariable("appid") Integer appid) {
    AppListModel appInfoDetail = appInfo.getAppInfoDetail(appid);
    return R.ok().put("appInfo", appInfoDetail);
  }

  @RequestMapping("category_info")
  @RequiresPermissions("appstore:cms:category")
  public R getCategoryInfo(){
    List<Category> categoryInfo = appInfo.getCategoryInfo();
    return R.ok().put("category", categoryInfo);
  }
  @RequestMapping("update_category")
  @RequiresPermissions("appstore:cms:category")
  public R updateCategoryInfo(@RequestBody AppListModel appListModel){
    if (appInfo.updateAppInfo(appListModel) != 0) {
      return R.error(10001, "update app info error!");
    }
    return R.ok();
  }
}
