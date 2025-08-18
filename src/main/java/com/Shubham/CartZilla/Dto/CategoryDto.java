package com.Shubham.CartZilla.Dto;

import com.Shubham.CartZilla.Entity.Enums.CategoriesAndSlugs;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Long categoryId;
    private CategoriesAndSlugs categoryName;
    private String categorySlug;
    private String categoryDesc;
    private LocalDateTime createdAt;

}
