package com.EXWUYA.services;

import com.EXWUYA.entity.results.ResultBean;
import com.EXWUYA.tools.ResultCode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    public ResultBean paymentInfo(int id){
        System.out.println("线程池:\t"+Thread.currentThread().getName()+"无延迟\t"+"ID:\t"+id);
        return new ResultBean(" ", ResultCode.SUCCESS,"sucees paymentInfo");
    }

    public ResultBean paymentInfo_delay(int id){
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("线程池:\t"+Thread.currentThread().getName()+"延迟三秒\t"+"ID:\t"+id);
        return new ResultBean(" ", ResultCode.SUCCESS,"sucees paymentInfo_delay");
    }
}
