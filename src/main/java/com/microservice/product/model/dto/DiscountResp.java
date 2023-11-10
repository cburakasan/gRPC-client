package com.microservice.product.model.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscountResp implements Serializable {
    private DiscountDto discount;

    private BigDecimal oldPrice;

    private BigDecimal newPrice;
}

