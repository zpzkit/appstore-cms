package com.mobvoi.appstore.mapper;

import com.mobvoi.appstore.model.UserPaymentHistory;
import com.mobvoi.appstore.model.UserPaymentHistoryKey;

public interface UserPaymentHistoryMapper {
    int deleteByPrimaryKey(UserPaymentHistoryKey key);

    int insert(UserPaymentHistory record);

    int insertSelective(UserPaymentHistory record);

    UserPaymentHistory selectByPrimaryKey(UserPaymentHistoryKey key);

    int updateByPrimaryKeySelective(UserPaymentHistory record);

    int updateByPrimaryKey(UserPaymentHistory record);
}