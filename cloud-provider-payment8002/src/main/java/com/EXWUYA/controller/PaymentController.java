package com.EXWUYA.controller;

import com.EXWUYA.dao.PaymentDao;
import com.EXWUYA.entity.results.ResultBean;
import com.EXWUYA.entity.payment;
import com.EXWUYA.service.Imp.PaymentServiceImp;
import com.EXWUYA.service.PaymentService;
import com.EXWUYA.tools.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.swing.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
      @Autowired
      private PaymentService paymentService;

      @Value("${server.port}")
      private  String port;

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @PostMapping("/create")
    public ResultBean<Integer> create(@RequestBody payment payment){
        int result = paymentService.create(payment);
        logger.info("插入结果: "+result);

        if(result>0){
          return new ResultBean(result,ResultCode.SUCCESS,"插入数据库成功"+port);
        }else {
            return new ResultBean(null,ResultCode.FATAL_EXCEPTION,"插入数据库失败"+port);
        }

    }

    @GetMapping("/get/{id}")
    public ResultBean getPaymentById(@PathVariable("id")long id){
        System.out.println(id);
        payment payment = paymentService.selectPaymentById(id);
        logger.info("***查询结果*** :"+payment);
        if (payment!=null){
            return new ResultBean(payment,ResultCode.SUCCESS,"查询成功"+port);
        }else {
            return new ResultBean(null,ResultCode.FATAL_EXCEPTION,"查询失败，没有对应的记录"+port);
        }

    }

    @GetMapping("/test")
    public void getHeader(@RequestParam("Accept-Encoding") String header){
        System.out.println(header);
    }

    @GetMapping("/lb")
    public String getPort(){
        return port;
    }
}
