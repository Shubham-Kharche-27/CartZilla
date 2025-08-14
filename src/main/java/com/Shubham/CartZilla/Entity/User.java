package com.Shubham.CartZilla.Entity;

import com.Shubham.CartZilla.Entity.Enums.UserVerified;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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

    @PrePersist
    public void setUserCreatedAt() {
        createdAt = LocalDateTime.now();
    }
}
