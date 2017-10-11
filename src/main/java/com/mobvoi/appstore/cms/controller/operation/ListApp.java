package com.mobvoi.appstore.cms.controller.operation;

import com.github.pagehelper.PageInfo;
import com.mobvoi.appstore.cms.model.AppListModel;
import com.mobvoi.appstore.cms.model.Category;
import com.mobvoi.appstore.cms.service.cms.impl.AppInfoImp;
import com.mobvoi.appstore.cms.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang (pengzhang@mobvoi.com)on 2017/8/30.
 */
@RestController
@RequestMapping("appstore/cms")
public class ListApp {

  @Resource
  AppInfoImp appInfoImp;

  @RequestMapping("list")
  @RequiresPermissions("appstore:cms:common:list")
  public R cmslist(Integer pageNum, Integer pageSize, String platform) {
    List<AppListModel> appInfoDetail = appInfoImp.getAppInfoListDetail(pageNum, pageSize, true);
    PageInfo<AppListModel> pageInfo = new PageInfo<>(appInfoDetail);
    pageInfo.setList(appInfoDetail);

    return R.ok().put("page", pageInfo);
  }

  @RequestMapping("appInfo/{appid}")
  @RequiresPermissions("appstore:cms:appInfo")
  public R getAppInfoById(@PathVariable("appid") Integer appid) {
    AppListModel appInfoDetail = appInfoImp.getAppInfoDetail(appid);
    return R.ok().put("appInfo", appInfoDetail);
  }

  @RequestMapping("category_info")
  @RequiresPermissions("appstore:cms:category")
  public R getCategoryInfo(){
    List<Category> categoryInfo = appInfoImp.getCategoryInfo();
    return R.ok().put("category", categoryInfo);
  }

  @RequestMapping("update_category")
  @RequiresPermissions("appstore:cms:category")
  public R updateCategoryInfo(@RequestBody AppListModel appListModel){
    if (appInfoImp.updateAppInfo(appListModel) != 0) {
      return R.error(10001, "update app info error!");
    }
    return R.ok();
  }

  @RequestMapping("search_app")
  @RequiresPermissions("appstore:cms:category")
  public R searchApp(Integer pageNum, Integer pageSize, String appName, int appid, long startT, long endT) {
    List<AppListModel> appListModels = null;
    if (appid > 0 || appName != null) {
      AppListModel appListModel = appInfoImp.SearchAppById(appid);
      appListModels = new ArrayList<>();
      appListModels.add(appListModel);
    }else if (startT > 0 && endT > 0 && startT < endT){
      appListModels = appInfoImp.SearchAppList(pageNum, pageSize, true, startT, endT);
    }
    PageInfo<AppListModel> pageInfo = new PageInfo<>(appListModels);
    return R.ok().put("page", pageInfo);
  }
}
