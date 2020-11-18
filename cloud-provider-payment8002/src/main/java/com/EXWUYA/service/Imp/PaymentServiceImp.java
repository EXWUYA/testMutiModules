package com.EXWUYA.service.Imp;

import com.EXWUYA.dao.PaymentDao;
import com.EXWUYA.entity.payment;
import com.EXWUYA.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImp implements PaymentService {
    @Autowired
    private  PaymentDao paymentDao;

    @Override
    public int create(payment payment) {
       return paymentDao.create(payment);
    }

    @Override
    public payment selectPaymentById(long id) {
        return paymentDao.selectPaymentById(id);
    }
}
