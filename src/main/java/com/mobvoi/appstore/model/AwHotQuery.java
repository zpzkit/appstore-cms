package com.mobvoi.appstore.model;

public class AwHotQuery {
    private String data;

    private Integer time;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}