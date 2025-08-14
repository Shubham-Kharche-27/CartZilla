package com.Shubham.CartZilla.Dto;

import com.Shubham.CartZilla.Entity.Enums.UserVerified;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;

public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String userAddress;
    private String city;
    private String state;
    private String country;

    @Email(message = "Enter valid email Id")
    private String userEmail;

    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone number!")
    private String userPhoneNum;

    private UserVerified isUserVerified;
    private LocalDateTime createdAt;
    private Long cartId;
}
