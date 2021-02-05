package com.gadgetmart.model;

import lombok.Data;

/**
 * @author thilinamullewidane
 */
@Data
public class OrderDetail {
    private int orderDetailId;
    private int orderId;
    private int productId;
    private String productName;
    private String type;
    private String businessKey;
    private float price;
    private int qty;
}
