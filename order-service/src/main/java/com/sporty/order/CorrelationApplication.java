package com.sporty.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.sporty"})
@EnableFeignClients
public class CorrelationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorrelationApplication.class, args);
    }

}
