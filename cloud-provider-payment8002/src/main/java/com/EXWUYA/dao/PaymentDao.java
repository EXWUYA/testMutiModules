package com.EXWUYA.dao;

import org.apache.ibatis.annotations.Mapper;
import com.EXWUYA.entity.payment;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
     int create(payment payment);
     payment selectPaymentById(@Param("id") long id);

}
