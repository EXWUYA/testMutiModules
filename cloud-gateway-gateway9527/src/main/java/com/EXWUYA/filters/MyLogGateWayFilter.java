package com.EXWUYA.filters;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter , Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println(exchange.getClass().getTypeName());
        System.out.println(exchange.getRequest().getClass().getTypeName());
        System.out.println(exchange.getResponse().getClass().getTypeName());

        log.info("*************come in MyLogGateWayFilter:\t"+LocalDate.now());
        String uname=exchange.getRequest().getQueryParams().getFirst("uname");
        if (uname==null){
            log.info("**********用户名为null 非法用户 o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);

    }

    @Override
    public int getOrder() {
        return 0;
    }
}
