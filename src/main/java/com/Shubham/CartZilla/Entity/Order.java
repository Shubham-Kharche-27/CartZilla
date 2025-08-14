package com.Shubham.CartZilla.Entity;

import com.Shubham.CartZilla.Entity.Enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private double totalAmount;
    private String shippingAddress;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private LocalDateTime placedAt;
    private LocalDateTime deliveredAt;
    private LocalDateTime createdAt;

    @PrePersist
    public void setDateAndTime(){
        placedAt=LocalDateTime.now();
        createdAt=LocalDateTime.now();
        deliveredAt=placedAt.plusDays(15);
    }

}
