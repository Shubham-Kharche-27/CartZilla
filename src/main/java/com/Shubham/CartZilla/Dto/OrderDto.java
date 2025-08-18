package com.Shubham.CartZilla.Dto;

import com.Shubham.CartZilla.Entity.Enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class OrderDto {

    private Long orderId;
    private Double totalAmount;
    private String shippingAddress;
    private OrderStatus orderStatus;
    private LocalDateTime placedAt;
    private LocalDateTime deliveredAt;
    private LocalDateTime createdAt;
    private UserDto user;
    private List<OrderItemDto> orderItems;

}
