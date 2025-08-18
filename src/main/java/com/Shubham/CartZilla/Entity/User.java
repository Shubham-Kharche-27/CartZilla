package com.Shubham.CartZilla.Entity;

import com.Shubham.CartZilla.Entity.Enums.UserVerified;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstName;
    private String lastName;
    private String userAddress;
    private String city;
    private String state;
    private String country;
    private String userEmail;
    private String userPhoneNum;

    @Enumerated(EnumType.STRING)
    private UserVerified isUserVerified;

    private LocalDateTime createdAt;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonBackReference(value = "cartReference")
    private Cart cart;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonBackReference(value = "orderReference")
    private List<Order> orders = new ArrayList<>();


    @PrePersist
    public void setUserCreatedAt() {
        createdAt = LocalDateTime.now();
    }
}
