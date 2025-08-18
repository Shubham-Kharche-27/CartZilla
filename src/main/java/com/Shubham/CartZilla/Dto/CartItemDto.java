package com.Shubham.CartZilla.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class CartItemDto {

    private Long cartItemId;
    private int quantity;
    private double pricePerUnit;
    private double totalItemPrice;
    private LocalDateTime createdAt;
    private CartDto cart;
    private ProductDto product;

}
