package com.mobvoi.appstore.model;

public class UserPaymentHistoryKey {
    private String wwid;

    private Integer appid;

    public String getWwid() {
        return wwid;
    }

    public void setWwid(String wwid) {
        this.wwid = wwid == null ? null : wwid.trim();
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }
}