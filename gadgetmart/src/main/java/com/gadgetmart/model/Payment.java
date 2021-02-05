package com.gadgetmart.model;

import lombok.Data;

import java.util.Date;

/**
 * @author thilinamullewidane
 */
@Data
public class Payment {
    private int paymentId;
    private int orderId;
    private float paidAmount;
    private String createdUser;
    private Date createdDate;
    private int paymentIsComplete;
}
