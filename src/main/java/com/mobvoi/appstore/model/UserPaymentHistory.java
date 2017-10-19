package com.mobvoi.appstore.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserPaymentHistory extends UserPaymentHistoryKey {
    private BigDecimal price;

    private Date time;

    private String orderId;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}