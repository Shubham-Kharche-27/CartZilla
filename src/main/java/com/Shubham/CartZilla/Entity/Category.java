package com.Shubham.CartZilla.Entity;

import com.Shubham.CartZilla.Entity.Enums.CategoriesAndSlugs;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Enumerated(EnumType.STRING)
    private CategoriesAndSlugs categoryName;
    private String categorySlug;
    private String categoryDesc;
    private LocalDateTime createdAt;

    @PrePersist
    public void setUserCreatedAt() {
        createdAt = LocalDateTime.now();
        if(categoryName!=null){
            categorySlug= categoryName.getSlug();
        }
    }
}
