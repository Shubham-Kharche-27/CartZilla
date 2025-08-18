package com.Shubham.CartZilla.Entity;

import com.Shubham.CartZilla.Entity.Enums.CategoriesAndSlugs;
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

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    @JsonBackReference(value = "categoryReference")
    private List<Product> products = new ArrayList<>();

    @PrePersist
    public void setUserCreatedAt() {
        createdAt = LocalDateTime.now();
        if(categoryName!=null){
            categorySlug= categoryName.getSlug();
        }
    }
}
