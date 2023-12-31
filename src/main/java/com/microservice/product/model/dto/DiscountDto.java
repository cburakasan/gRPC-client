package com.microservice.product.model.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiscountDto implements Serializable {
    private String code;

    private BigDecimal discountPrice;
}