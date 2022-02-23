package com.sporty.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sporty.correlation.vo.PaymentVO;

@RestController
@RequestMapping("/api/payments")
@Slf4j
public class PaymentController {

    @PostMapping("")
    public void createPayment(@RequestBody PaymentVO paymentVO) {
        log.info("Payment is requested {}", paymentVO);
    }

}
