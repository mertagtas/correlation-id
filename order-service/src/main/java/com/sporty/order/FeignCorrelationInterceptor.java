package com.sporty.order;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Component
public class FeignCorrelationInterceptor implements RequestInterceptor {

    private static final String HEADER_NAME = "correlation-id";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(HEADER_NAME, MDC.get(HEADER_NAME));
    }
}
