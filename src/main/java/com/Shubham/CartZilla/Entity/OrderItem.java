package com.Shubham.CartZilla.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderItem")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;
    private Integer quantity;
    private Double pricePerUnit;
    private Double totalItemPrice;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "orderId")
    @JsonManagedReference(value = "orderItemReference")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "productId")
    @JsonManagedReference(value = "productOrderReference")
    private Product product;

    @PrePersist
    public void setCreatedAt(){
        createdAt=LocalDateTime.now();
    }
}
