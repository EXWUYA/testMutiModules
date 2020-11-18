package com.EXWUYA.openfeign;

import com.EXWUYA.entity.results.ResultBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentService {

    @GetMapping("/Provider/Payment/paymentInfo/{id}")
     ResultBean paymentInfo(@PathVariable("id") int id);

    @GetMapping("/Provider/Payment/paymentInfo_delay/{id}")
    ResultBean paymentInfo_delay(@PathVariable("id") int id);
}
