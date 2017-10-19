package com.mobvoi.appstore.model;

public class SupportWatchModelKey {
    private Integer appid;

    private String watch;

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getWatch() {
        return watch;
    }

    public void setWatch(String watch) {
        this.watch = watch == null ? null : watch.trim();
    }
}