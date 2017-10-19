package com.mobvoi.appstore.model;

public class AppHistoryStats {
    private Integer id;

    private Integer collect;

    private Integer downloadSuccess;

    private Integer installSuccess;

    private Integer cancelCollect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public Integer getDownloadSuccess() {
        return downloadSuccess;
    }

    public void setDownloadSuccess(Integer downloadSuccess) {
        this.downloadSuccess = downloadSuccess;
    }

    public Integer getInstallSuccess() {
        return installSuccess;
    }

    public void setInstallSuccess(Integer installSuccess) {
        this.installSuccess = installSuccess;
    }

    public Integer getCancelCollect() {
        return cancelCollect;
    }

    public void setCancelCollect(Integer cancelCollect) {
        this.cancelCollect = cancelCollect;
    }
}