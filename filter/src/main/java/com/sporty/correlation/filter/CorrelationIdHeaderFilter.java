package com.sporty.correlation.filter;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CorrelationIdHeaderFilter extends OncePerRequestFilter {

    private static final String CORRELATION_ID = "correlation-id";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try (MDC.MDCCloseable mdcCloseable = MDC.putCloseable(CORRELATION_ID, request.getHeader(CORRELATION_ID))) {
            filterChain.doFilter(request, response);
        }
    }
}
