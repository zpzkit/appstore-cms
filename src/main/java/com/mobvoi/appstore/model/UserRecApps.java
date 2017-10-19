package com.mobvoi.appstore.model;

public class UserRecApps {
    private String id;

    private String recommends;

    private Long lastupdatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRecommends() {
        return recommends;
    }

    public void setRecommends(String recommends) {
        this.recommends = recommends == null ? null : recommends.trim();
    }

    public Long getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Long lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}