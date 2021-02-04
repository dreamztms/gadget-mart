package com.gadgetmart.repository;

import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;

import java.util.List;

public interface ApiRepository {
    List<Product> getProductList(List<ProductFilter> productFilter);
}
