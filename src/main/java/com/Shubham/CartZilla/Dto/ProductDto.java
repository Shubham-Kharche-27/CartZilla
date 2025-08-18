package com.Shubham.CartZilla.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class ProductDto {

    private Long productId;
    private String productName;
    private String productDesc;
    private double productPrice;
    private double productDiscountedPrice;
    private int stockQuantity;
    private LocalDateTime createdAt;
    private CategoryDto category;

}
