package com.Shubham.CartZilla.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class OrderItemDto {

    private Long orderItemId;
    private Integer quantity;
    private Double pricePerUnit;
    private Double totalItemPrice;
    private LocalDateTime createdAt;
    private OrderDto order;
    private ProductDto product;

}
