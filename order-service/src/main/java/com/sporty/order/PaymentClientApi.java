package com.sporty.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import com.sporty.correlation.vo.PaymentVO;

@FeignClient(name = "payment-api", url = "http://localhost:8081/api")
public interface PaymentClientApi {
    @PostMapping(value = "/payments")
    String createPayment(PaymentVO paymentVO);
}
