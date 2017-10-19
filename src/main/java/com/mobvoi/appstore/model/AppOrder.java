package com.mobvoi.appstore.model;

import java.math.BigDecimal;
import java.util.Date;

public class AppOrder {
    private String id;

    private String apkPackageName;

    private Integer appid;

    private Integer versionCode;

    private String userWwid;

    private BigDecimal price;

    private String currency;

    private String developerWwid;

    private Date time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getApkPackageName() {
        return apkPackageName;
    }

    public void setApkPackageName(String apkPackageName) {
        this.apkPackageName = apkPackageName == null ? null : apkPackageName.trim();
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getUserWwid() {
        return userWwid;
    }

    public void setUserWwid(String userWwid) {
        this.userWwid = userWwid == null ? null : userWwid.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getDeveloperWwid() {
        return developerWwid;
    }

    public void setDeveloperWwid(String developerWwid) {
        this.developerWwid = developerWwid == null ? null : developerWwid.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}