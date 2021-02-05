package com.gadgetmart.repository;

import com.gadgetmart.model.Supplier;

import java.util.List;

/**
 * @author thilinamullewidane
 */
public interface SupplierRepository {
    Integer registerSupplier(Supplier supplier);

    Integer updateSupplier(Supplier supplier);

    Supplier getSupplierDetail(String supplierId);

    List<Supplier> getSupplierList();
}
