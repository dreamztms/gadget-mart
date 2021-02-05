package com.gadgetmart.service;

import com.gadgetmart.model.Supplier;

import java.util.List;

/**
 * @author thilinamullewidane
 */
public interface SupplierService {
    Integer registerSupplier(Supplier userProfile);

    Integer updateSupplier(Supplier supplier);

    Supplier getSupplierDetail(String supplierId);

    List<Supplier> getSupplierList();
}
