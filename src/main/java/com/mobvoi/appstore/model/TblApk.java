package com.mobvoi.appstore.model;

import java.util.Date;

public class TblApk {
    private Integer apkId;

    private String apkUrl;

    private String packageName;

    private String version;

    private Long filesize;

    private String wearApkUrl;

    private Long wearApkSize;

    private Date updateTime;

    private Date uploadTime;

    private String picUrl;

    private String logoUrl;

    private Long appId;

    private Integer versionCode;

    private String apkMd5;

    public Integer getApkId() {
        return apkId;
    }

    public void setApkId(Integer apkId) {
        this.apkId = apkId;
    }

    public String getApkUrl() {
        return apkUrl;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl == null ? null : apkUrl.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public String getWearApkUrl() {
        return wearApkUrl;
    }

    public void setWearApkUrl(String wearApkUrl) {
        this.wearApkUrl = wearApkUrl == null ? null : wearApkUrl.trim();
    }

    public Long getWearApkSize() {
        return wearApkSize;
    }

    public void setWearApkSize(Long wearApkSize) {
        this.wearApkSize = wearApkSize;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getApkMd5() {
        return apkMd5;
    }

    public void setApkMd5(String apkMd5) {
        this.apkMd5 = apkMd5 == null ? null : apkMd5.trim();
    }
}