package com.mobvoi.appstore.model;

public class ItmMfAls {
    private String id;

    private String alsFeatsGa;

    private String alsLastUpdateTimeGa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAlsFeatsGa() {
        return alsFeatsGa;
    }

    public void setAlsFeatsGa(String alsFeatsGa) {
        this.alsFeatsGa = alsFeatsGa == null ? null : alsFeatsGa.trim();
    }

    public String getAlsLastUpdateTimeGa() {
        return alsLastUpdateTimeGa;
    }

    public void setAlsLastUpdateTimeGa(String alsLastUpdateTimeGa) {
        this.alsLastUpdateTimeGa = alsLastUpdateTimeGa == null ? null : alsLastUpdateTimeGa.trim();
    }
}