package com.EXWUYA;

import com.EXWUYA.controller.PaymentController;
import com.netflix.discovery.shared.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Payment8001 {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Payment8001.class, args);
        System.out.println(run.getBean("paymentController", PaymentController.class));
    }
}
