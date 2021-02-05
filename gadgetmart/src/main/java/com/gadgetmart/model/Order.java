package com.gadgetmart.model;

import lombok.Data;

import java.util.Date;

/**
 * @author thilinamullewidane
 */
@Data
public class Order {
    private int orderId;
    private float orderTotal;
    private Date orderDate;
    private String createdUser;
}
