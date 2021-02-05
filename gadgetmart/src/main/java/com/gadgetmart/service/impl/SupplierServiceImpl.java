package com.gadgetmart.service.impl;

import com.gadgetmart.model.Supplier;
import com.gadgetmart.repository.SupplierRepository;
import com.gadgetmart.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author thilinamullewidane
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Integer registerSupplier(Supplier supplier) {
        return supplierRepository.registerSupplier(supplier);
    }

    @Override
    public Integer updateSupplier(Supplier supplier) {
        return supplierRepository.updateSupplier(supplier);
    }

    @Override
    public Supplier getSupplierDetail(String supplierId) {
        return supplierRepository.getSupplierDetail(supplierId);
    }

    @Override
    public List<Supplier> getSupplierList() {
        return supplierRepository.getSupplierList();
    }
}
