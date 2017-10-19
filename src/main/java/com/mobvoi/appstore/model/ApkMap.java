package com.mobvoi.appstore.model;

public class ApkMap extends ApkMapKey {
    private String apkUrl;

    private String version;

    private Integer fileSize;

    private Boolean needAw;

    private String changelog;

    private Integer updateTime;

    private String apkMd5;

    private Integer wearFileSize;

    private String wearApkMd5;

    private Integer wearVersionCode;

    private String wearVersionName;

    public String getApkUrl() {
        return apkUrl;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl == null ? null : apkUrl.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Boolean getNeedAw() {
        return needAw;
    }

    public void setNeedAw(Boolean needAw) {
        this.needAw = needAw;
    }

    public String getChangelog() {
        return changelog;
    }

    public void setChangelog(String changelog) {
        this.changelog = changelog == null ? null : changelog.trim();
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getApkMd5() {
        return apkMd5;
    }

    public void setApkMd5(String apkMd5) {
        this.apkMd5 = apkMd5 == null ? null : apkMd5.trim();
    }

    public Integer getWearFileSize() {
        return wearFileSize;
    }

    public void setWearFileSize(Integer wearFileSize) {
        this.wearFileSize = wearFileSize;
    }

    public String getWearApkMd5() {
        return wearApkMd5;
    }

    public void setWearApkMd5(String wearApkMd5) {
        this.wearApkMd5 = wearApkMd5 == null ? null : wearApkMd5.trim();
    }

    public Integer getWearVersionCode() {
        return wearVersionCode;
    }

    public void setWearVersionCode(Integer wearVersionCode) {
        this.wearVersionCode = wearVersionCode;
    }

    public String getWearVersionName() {
        return wearVersionName;
    }

    public void setWearVersionName(String wearVersionName) {
        this.wearVersionName = wearVersionName == null ? null : wearVersionName.trim();
    }
}