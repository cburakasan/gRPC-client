package com.microservice.product.service.grpc;

import com.microservice.grpc.DiscountRequest;
import com.microservice.product.model.dto.AddDiscountCategoryRequest;
import com.microservice.product.model.dto.AddDiscountCategoryResp;
import com.microservice.product.model.dto.DiscountServiceResponse;

public interface DiscountGrpcService {
    DiscountServiceResponse getDiscount(DiscountRequest discountRequest);

    AddDiscountCategoryResp addDiscountCategoryList(AddDiscountCategoryRequest addDiscountCategoryRequest);
}
