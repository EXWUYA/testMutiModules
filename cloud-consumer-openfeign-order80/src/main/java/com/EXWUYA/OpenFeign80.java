package com.EXWUYA;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeign80 {
    public static void main(String[] args) {

        SpringApplication.run(OpenFeign80.class,args);
    }
}
