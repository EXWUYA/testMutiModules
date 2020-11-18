package com.EXWUYA.controller;

import com.EXWUYA.entity.results.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.EXWUYA.entity.payment;

@RestController
@RequestMapping("/consumer")
public class OrderController {
    public static final String PAYMENT_URL="http://CLOUD-PROVIDER-PAYMENT";

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/payment/create")
    public ResultBean<Integer> create( payment payment ){
        System.out.println(payment);
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,ResultBean.class);
    }

    @GetMapping("/payment/get/{id}")
    public ResultBean<payment> getPayment(@PathVariable("id")long id){
        System.out.println(PAYMENT_URL+"/payment/get/"+id);
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,ResultBean.class);
    }
}
