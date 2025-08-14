package com.Shubham.CartZilla.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    private int totalQuantity;
    private double totalPrice;
    private LocalDateTime createdAt;

    @OneToOne(mappedBy = "cart")
    private User user;

    @PrePersist
    public void setCreatedAt() {
        createdAt = LocalDateTime.now();
    }
}
