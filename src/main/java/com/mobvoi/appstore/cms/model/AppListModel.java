package com.mobvoi.appstore.cms.model;

import com.mobvoi.appstore.cms.dao.AppMapMapper;

/**
 * Created by watson on 2017/9/6.
 */
public class AppListModel extends AppMap{
  long lastUpdateTime;
  int commentsCount;
  String cpu;
  String watch;

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
