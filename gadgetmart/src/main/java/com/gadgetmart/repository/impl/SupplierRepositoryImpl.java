package com.gadgetmart.repository.impl;

import com.gadgetmart.model.Supplier;
import com.gadgetmart.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author thilinamullewidane
 */
@Repository
public class SupplierRepositoryImpl implements SupplierRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Integer registerSupplier(Supplier supplier) {
        return null;
    }

    @Override
    public Integer updateSupplier(Supplier supplier) {
        return null;
    }

    @Override
    public Supplier getSupplierDetail(String supplierId) {
        return null;
    }

    @Override
    public List<Supplier> getSupplierList() {
        return null;
    }
}
