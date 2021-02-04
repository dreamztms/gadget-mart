package com.gadgetmart.repository.impl;

import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;
import com.gadgetmart.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class ApiRepositoryImpl implements ApiRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<Product> getProductList(List<ProductFilter> productFilter) {
        StringBuilder getContactsQuery = new StringBuilder("select * from product");

        return namedParameterJdbcTemplate.query(
                getContactsQuery.toString(),
                Collections.emptyMap(),
                (rs, i) -> {
                    Product product = new Product();
                    product.setProductId(rs.getInt("PRODUCT_ID"));


                    return product;
                });
    }
}
