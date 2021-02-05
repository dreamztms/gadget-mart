package com.gadgetmart.model;

import lombok.Data;

/**
 * @author thilinamullewidane
 */
@Data
public class Supplier {
    private int supplierId;
    private String supplierName;
    private String description;
    private String hotline;
    private String address;
    private String businessKey;
    private String isActive;
}
