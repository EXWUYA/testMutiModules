package com.EXWUYA.controller;

import com.EXWUYA.entity.results.ResultBean;
import com.EXWUYA.services.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Provider/Payment")
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @GetMapping("/paymentInfo/{id}")
    public ResultBean paymentInfo(@PathVariable("id") int id){
       return paymentService.paymentInfo(id);
    }

    @GetMapping("/paymentInfo_delay/{id}")
    public ResultBean paymentInfo_delay(@PathVariable("id") int id){
      return paymentService.paymentInfo_delay(id);
    }

}
