package com.Shubham.CartZilla.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cartItem")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemId;
    private int quantity;
    private double pricePerUnit;
    private double totalItemPrice;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "cartId")
    @JsonManagedReference(value = "cartItemReference")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "productId")
    @JsonManagedReference(value = "productReference")
    private Product product;

    @PrePersist
    public void setCreatedAt(){
        createdAt = LocalDateTime.now();
    }
}
