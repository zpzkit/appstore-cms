package com.mobvoi.appstore.cms.model;

import com.mobvoi.appstore.cms.dao.AppMapMapper;

/**
 * Created by watson on 2017/9/6.
 */
public class AppListModel extends AppMap{
  String category1;
  String category2;
  String category3;
  long lastUpdateTime;
  int commentsCount;
  String cpu;
  String watch;

  public String getCategory1() {
    return category1;
  }

  public void setCategory1(String category1) {
    this.category1 = category1;
  }

  public String getCategory2() {
    return category2;
  }

  public void setCategory2(String category2) {
    this.category2 = category2;
  }

  public String getCategory3() {
    return category3;
  }

  public void setCategory3(String category3) {
    this.category3 = category3;
  }

  public long getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public int getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(int commentsCount) {
    this.commentsCount = commentsCount;
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getWatch() {
    return watch;
  }

  public void setWatch(String watch) {
    this.watch = watch;
  }
}
