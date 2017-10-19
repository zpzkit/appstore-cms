package com.mobvoi.appstore.model;

public class SpecialTopicContent extends SpecialTopicContentKey {
    private String applist;

    public String getApplist() {
        return applist;
    }

    public void setApplist(String applist) {
        this.applist = applist == null ? null : applist.trim();
    }
}