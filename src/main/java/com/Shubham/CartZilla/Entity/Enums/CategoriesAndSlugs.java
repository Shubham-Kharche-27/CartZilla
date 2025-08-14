package com.Shubham.CartZilla.Entity.Enums;

public enum CategoriesAndSlugs {

    ELECTRONICS("Electronics", "electronics"),
    CLOTHING("Clothing", "clothing"),
    BOOKS("Books", "books"),
    FURNITURE("Furniture", "furniture"),
    TOYS("Toys", "toys"),
    BEAUTY("Beauty & Personal Care", "beauty"),
    SPORTS("Sports & Outdoors", "sports"),
    AUTOMOTIVE("Automotive", "automotive"),
    GROCERY("Grocery & Gourmet", "grocery"),
    JEWELRY("Jewelry", "jewelry"),
    MUSIC("Music & Instruments", "music"),
    GARDEN("Garden & Outdoor", "garden"),
    OFFICE("Office Supplies", "office"),
    PETS("Pet Supplies", "pets"),
    HEALTH("Health & Wellness", "health"),
    SHOES("Shoes", "shoes"),
    BAGS("Bags & Luggage", "bags"),
    HOME_DECOR("Home Decor", "home-decor"),
    MOBILE("Mobiles & Accessories", "mobile"),
    COMPUTERS("Computers & Accessories", "computers");

    private final String displayName;
    private final String slug;

    CategoriesAndSlugs(String displayName, String slug) {
        this.displayName = displayName;
        this.slug = slug;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSlug() {
        return slug;
    }
}
