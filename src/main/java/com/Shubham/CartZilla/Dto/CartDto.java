package com.Shubham.CartZilla.Dto;

import com.Shubham.CartZilla.Entity.CartItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class CartDto {
    private Long cartId;
    private Integer totalQuantity;
    private Double totalPrice;
    private LocalDateTime createdAt;
    private UserDto user;
    private CartItem cartItems;
}
