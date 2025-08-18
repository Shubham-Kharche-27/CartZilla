package com.Shubham.CartZilla.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private String productDesc;
    private double productPrice;
    private double productDiscountedPrice;
    private int stockQuantity;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    @JsonBackReference(value = "productReference")
    private List<CartItem> cartItems = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonManagedReference(value = "categoryReference")
    private Category category;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    @JsonBackReference(value = "productOrderReference")
    private List<OrderItem> orderItems = new ArrayList<>();

    @PrePersist
    public void setCreatedAt() {
        createdAt = LocalDateTime.now();
    }
}
