package com.EXWUYA.service;

import com.EXWUYA.entity.payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
      int create(payment payment);
     payment selectPaymentById( long id);
}
