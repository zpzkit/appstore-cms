package com.mobvoi.appstore.model;

public class Developer {
    private Integer id;

    private String developerName;

    private String developerEmail;

    private String wwid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName == null ? null : developerName.trim();
    }

    public String getDeveloperEmail() {
        return developerEmail;
    }

    public void setDeveloperEmail(String developerEmail) {
        this.developerEmail = developerEmail == null ? null : developerEmail.trim();
    }

    public String getWwid() {
        return wwid;
    }

    public void setWwid(String wwid) {
        this.wwid = wwid == null ? null : wwid.trim();
    }
}