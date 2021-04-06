package com.softlogic.model;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private String productId;
    private String productName;
    private String productDescription;
    private String type;
    private int qty;
    private float price;
    private List<ProductImage> productImages;
}
