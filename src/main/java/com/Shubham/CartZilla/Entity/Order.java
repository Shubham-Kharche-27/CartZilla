package com.Shubham.CartZilla.Entity;

import com.Shubham.CartZilla.Entity.Enums.OrderStatus;
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
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Double totalAmount;
    private String shippingAddress;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private LocalDateTime placedAt;
    private LocalDateTime deliveredAt;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonManagedReference("orderReference")
    private User user;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    @JsonBackReference(value = "orderItemReference")
    private List<OrderItem> orderItems = new ArrayList<>();

    @PrePersist
    public void setDateAndTime(){
        placedAt=LocalDateTime.now();
        createdAt=LocalDateTime.now();
        deliveredAt=placedAt.plusDays(15);
    }

}
