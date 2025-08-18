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
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    private Integer totalQuantity;
    private Double totalPrice;
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "userId")
    @JsonManagedReference(value = "cartReference")
    private User user;

    @OneToMany(mappedBy = "cart",cascade =CascadeType.ALL)
    @JsonBackReference(value = "cartItemReference")
    private List<CartItem> cartItems = new ArrayList<>();

    @PrePersist
    public void setCreatedAt() {
        createdAt = LocalDateTime.now();
    }
}
