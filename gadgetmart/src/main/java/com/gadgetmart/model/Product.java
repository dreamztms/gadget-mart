package com.gadgetmart.model;

import lombok.Data;

@Data
public class Product {
    private long productId;
    private String productName;
    private String productDescription;
    private String type;
    private int qty;
    private float price;
}
