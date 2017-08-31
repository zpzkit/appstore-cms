package com.mobvoi.appstore.cms.controller.operation;

import com.mobvoi.appstore.cms.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhang (pengzhang@mobvoi.com)on 2017/8/30.
 */
@RestController
@RequestMapping("appstore/cms")
public class ListApp {

  @RequestMapping("list")
  @RequiresPermissions("appstore:cms:common:list")
  public R cmslist(Integer page, Integer limit, String platform) {

    System.out.println("aaaaaa");
    return R.ok().put("page", "abbbbbb");
  }
}
