package com.mobvoi.appstore.appdeveloper.controller;

import com.mobvoi.appstore.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by watson on 2017/10/19.
 */
@RestController
@RequestMapping("developer")
public class UploadApk {

  @RequestMapping("test")
  public R getList() {

    return R.ok().put("aaaa", "aaa");
  }
}
