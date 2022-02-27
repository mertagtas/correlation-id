package com.sporty.order;

import com.sporty.correlation.vo.PaymentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sporty.correlation.vo.OrderVO;

import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
@Slf4j
public class OrderController {

    private final PaymentClientApi paymentClientApi;

    public OrderController(PaymentClientApi paymentClientApi) {
        this.paymentClientApi = paymentClientApi;
    }

    @PostMapping("")
    public void createOrder(@RequestBody OrderVO order) {
        log.info("Order is requested {}", order);
        PaymentVO paymentVO = PaymentVO.builder()
                .id(UUID.randomUUID().toString())
                .name(order.name())
                .build();
        log.info("Calling payment endpoint {}", paymentVO);
        paymentClientApi.createPayment(paymentVO);
    }

}
