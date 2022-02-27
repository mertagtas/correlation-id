package com.sporty.correlation.vo;

import lombok.Builder;

public record PaymentVO(
        String id,
        String name
) {
    @Builder
    public PaymentVO {
    }
}
